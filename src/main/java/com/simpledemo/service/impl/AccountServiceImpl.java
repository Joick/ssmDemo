package com.simpledemo.service.impl;

import com.simpledemo.dao.TUserMapper;
import com.simpledemo.entity.TUser;
import com.simpledemo.entity.TUserExample;
import com.simpledemo.model.common.Cache;
import com.simpledemo.model.common.Constant;
import com.simpledemo.model.request.LoginReqModel;
import com.simpledemo.model.request.RegisterReqModel;
import com.simpledemo.model.request.SendSmsMessageReqModel;
import com.simpledemo.service.AccountService;
import com.simpledemo.utility.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

/**
 * @author hey
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private TUserMapper tUserMapper;

    private TUserExample tUserExample = new TUserExample();

    public Result<String> doUserRegist(RegisterReqModel reqModel) {

        Result<String> result = new Result<String>();

        TUser tUser = reqModel.convertToEntity();

        tUserMapper.insert(tUser);

        result.success();

        return result;
    }

    public Result<TUser> doUserLogin(LoginReqModel reqModel) {

        Result<TUser> result = new Result<TUser>();

        String verifyCode = reqModel.getVerifyCode();

        if ("123456" != verifyCode) {
            result.fail("验证码不正确");

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

    public Result doSendSmsMessage(SendSmsMessageReqModel reqModel) {

        Result result = new Result();

        Random random = new Random();

        String code = "";

        for (int i = 0; i < 6; i++) {

            // 生成 [0,10) 中的随机数
            code += random.nextInt(10);
        }

        String cacheKey = Constant.CacheCaptcha.generateSmsCacheKey(reqModel.getPhone());

        Cache cache = new Cache();

        cache.setKey(cacheKey);
        cache.setValue(code);

        result.success();

        return result;
    }
}
