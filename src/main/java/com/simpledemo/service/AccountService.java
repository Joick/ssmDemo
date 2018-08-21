package com.simpledemo.service;

import com.simpledemo.entity.TUser;
import com.simpledemo.model.request.LoginReqModel;
import com.simpledemo.model.request.RegisterReqModel;
import com.simpledemo.utility.Result;

/**
 * @author hey
 */
public interface AccountService {

    /**
     * 用户注册
     *
     * @param reqModel
     * @return
     */
    Result<String> doUserRegist(RegisterReqModel reqModel);

    /**
     * 用户登录
     *
     * @param reqModel
     * @return
     */
    Result<TUser> doUserLogin(LoginReqModel reqModel);
}
