package com.simpledemo.controller;

import com.simpledemo.entity.AdminUser;
import com.simpledemo.model.home.LoginModel;
import com.simpledemo.service.AdminUserService;
import com.simpledemo.utilities.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Administrator
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private AdminUserService userService;

    @PostMapping("/login")
    @ResponseBody
    public Result<Object> login(@RequestBody LoginModel reqModel) {
        Result<Object> result = new Result<Object>();
        String account = reqModel.getAccount();
        String password = reqModel.getPassword();

        if (StringUtils.isEmpty(account) || StringUtils.isEmpty(password)) {
            result.fail("账号或密码不能为空");
            return result;
        }

        AdminUser user = userService.getAdminUser(account, password);

        if (user != null && user.getId() > 0) {
            result.success();
        } else {
            result.fail("登录失败");
        }

        return result;
    }
}
