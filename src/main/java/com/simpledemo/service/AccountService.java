package com.simpledemo.service;

import com.simpledemo.model.request.LoginReqModel;
import com.simpledemo.model.request.RegisterReqModel;
import com.simpledemo.model.request.SendSmsMessageReqModel;
import com.simpledemo.utility.Result;

public interface AccountService {

    /**
     * 用户注册
     *
     * @param reqModel
     * @return
     */
    Result doUserRegist(RegisterReqModel reqModel);

    /**
     * 用户登录
     *
     * @param reqModel
     * @return
     */
    Result doUserLogin(LoginReqModel reqModel);

    /**
     * 发送短信验证码
     *
     * @param reqModel
     * @return
     */
    Result doSendSmsMessage(SendSmsMessageReqModel reqModel);

    Result updateUserAccount(LoginReqModel reqModel);

}
