package com.simpledemo.service.impl;

import com.simpledemo.dao.TUserMapper;
import com.simpledemo.entity.TUser;
import com.simpledemo.entity.TUserExample;
import com.simpledemo.model.common.Cache;
import com.simpledemo.model.common.SuffixConstant;
import com.simpledemo.model.request.LoginReqModel;
import com.simpledemo.model.request.RegisterReqModel;
import com.simpledemo.model.request.SendSmsMessageReqModel;
import com.simpledemo.service.AccountService;
import com.simpledemo.utility.CacheUtil;
import com.simpledemo.utility.Result;
import com.simpledemo.utility.UuidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class AccountServiceImpl implements AccountService {

    private Result result = new Result();

    @Autowired
    private TUserMapper tUserMapper;

    private TUserExample tUserExample = new TUserExample();

    public Result doUserRegist(RegisterReqModel reqModel) {

        TUser tUser = reqModel.convertToEntity();

        tUserMapper.insert(tUser);

        result.success();

        return result;
    }

    public Result doUserLogin(LoginReqModel reqModel) {

        if (reqModel != null) {
            switch (reqModel.getLoginType()) {
                case ACCOUNT:
                    result = doAccountLogin(reqModel);
                    break;
                case SMSCAPTCHA:
                    result = doSmsCaptchaLogin(reqModel);
                    break;
                default:
                    result.fail("请求数据有误");
                    break;
            }
        } else {
            result.fail("请求数据为空");
        }

        return result;

    }

    public Result doSendSmsMessage(SendSmsMessageReqModel reqModel) {

        Random random = new Random();

        String code = "";

        for (int i = 0; i < 6; i++) {

            // 生成 [0,10) 中的随机数
            code += random.nextInt(10);
        }

        String cacheKey = SuffixConstant.Captcha.generateSmsCacheKey(reqModel.getPhone());

        Cache cache = new Cache();

        cache.setKey(cacheKey);
        cache.setValue(code);

        result.success(cache);

        return result;
    }

    private Result doAccountLogin(LoginReqModel reqModel) {
        String verifyCode = reqModel.getVerifyCode();

        if (verifyCode == null || verifyCode.length() <= 0) {
            result.fail("验证码不能为空");
            return result;
        }

        tUserExample.clear();

        TUserExample.Criteria criteria = tUserExample.createCriteria();

        criteria.andAccountEqualTo(reqModel.getAccount());
        criteria.andPasswordEqualTo(reqModel.getPassword());

        List<TUser> userList = tUserMapper.selectByExample(tUserExample);

        TUser user = userList.size() <= 0 ? null : userList.get(0);

        result.success(user);

        return result;
    }

    private Result doSmsCaptchaLogin(LoginReqModel reqModel) {
        String key = SuffixConstant.Captcha.generateSmsCacheKey(reqModel.getPhone());

        if (CacheUtil.hasCache(key)) {
            Cache cache = CacheUtil.getCacheInfo(key);

            if (cache.getValue() == null) {
                result.fail("验证码已过期");
                return result;
            }

            if (reqModel.getSmsCode() != cache.getValue()) {
                result.fail("验证码不正确");
                return result;
            }

            TUserExample tUserExample = new TUserExample();

            tUserExample.createCriteria().andPhoneEqualTo(reqModel.getPhone());

            List<TUser> tUserList = tUserMapper.selectByExample(tUserExample);

            if (tUserList.size() <= 0) {
                TUser tUser = new TUser();
                tUser.setAccount(UuidUtil.getUUID());
                tUser.setPhone(reqModel.getPhone());
                tUser.setRoleId((long) 1);
                tUser.setRoleName("普通用户");

                tUserMapper.insert(tUser);
            }

            result.success("登录成功");
            return result;
        } else {
            result.fail("验证码已过期");
            return result;
        }
    }
}
