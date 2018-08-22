package com.simpledemo.controller;

import com.simpledemo.model.request.LoginReqModel;
import com.simpledemo.model.request.RegisterReqModel;
import com.simpledemo.model.request.SendSmsMessageReqModel;
import com.simpledemo.service.AccountService;
import com.simpledemo.utility.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/account")
public class AccountController {

    private Result result;

    @Autowired
    private AccountService accountService;

    @PostMapping("/regist")
    @ResponseBody
    public Result regist(@RequestBody RegisterReqModel reqModel) {
        result = accountService.doUserRegist(reqModel);
        return result;
    }

    @PostMapping("/login")
    @ResponseBody
    public Result login(@RequestBody LoginReqModel reqModel) {
        result = accountService.doUserLogin(reqModel);
        return result;
    }

    @PostMapping("/sendSmsMessage")
    @ResponseBody
    public Result doSendSmsMessage(@RequestBody SendSmsMessageReqModel reqModel) {
        result = accountService.doSendSmsMessage(reqModel);
        return result;
    }

}
