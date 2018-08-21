package com.simpledemo.controller;

import com.simpledemo.entity.TUser;
import com.simpledemo.model.request.LoginReqModel;
import com.simpledemo.model.request.RegisterReqModel;
import com.simpledemo.service.AccountService;
import com.simpledemo.utility.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Administrator
 */
@Controller
@RequestMapping("/home")
public class HomeController extends BaseController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/regist")
    @ResponseBody
    public Result<String> regist(@RequestBody RegisterReqModel reqModel) {
        Result<String> result = accountService.doUserRegist(reqModel);
        return result;
    }

    @PostMapping("/login")
    @ResponseBody
    public Result<TUser> login(@RequestBody LoginReqModel reqModel){
        Result<TUser> result = accountService.doUserLogin(reqModel);
        return result;
    }
}
