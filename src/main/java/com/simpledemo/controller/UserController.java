package com.simpledemo.controller;

import com.simpledemo.model.user.QueryUserModel;
import com.simpledemo.dto.Result;
import com.simpledemo.entity.User;
import com.simpledemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author Administrator
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService uesrService;

    @RequestMapping(value = "/detail", method = RequestMethod.POST, produces = {
            "application/json; charset=utf-8"})
    @ResponseBody
    public Result<User> detail(@RequestBody QueryUserModel model) {

        Result<User> result = new Result<User>();

        long userId = model.getUserId();

        if (userId == 0) {
            result.fail("userId有误");

            return result;
        }

        User user = uesrService.getUser(userId);

        result.success(user);

        return result;
    }
}
