package com.simpledemo.controller;

import com.simpledemo.model.role.RolesInsertModel;
import com.simpledemo.model.user.UserQueryModel;
import com.simpledemo.service.AdminRolesService;
import com.simpledemo.utilities.Result;
import com.simpledemo.entity.*;
import com.simpledemo.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private static Result result;

    @Autowired
    private AdminUserService userService;

    @Autowired
    private AdminRolesService roleService;


    /**
     * 获取账户权限
     *
     * @param reqModel
     * @return
     */
    @PostMapping(value = "/getUserRoles")
    @ResponseBody
    public Result<List<AdminRoles>> getUserRoles(@RequestBody UserQueryModel reqModel) {

        result = new Result<List<AdminRoles>>();

        long userId = reqModel.getUserId();

        if (userId > 0) {
            List<AdminRoles> userRoles = new ArrayList<AdminRoles>();

            userRoles = roleService.listUserRoles(userId);

            result.success(userRoles);

        } else {
            result.fail("用户id有误");
        }

        return result;
    }

    /**
     * 获取权限列表
     *
     * @return
     */
    @PostMapping(value = "/addRoles")
    @ResponseBody
    public Result<List<AdminRoles>> addRoles(@RequestBody RolesInsertModel reqModel) {

        result = new Result<List<AdminRoles>>();

        result.success();

        return result;
    }

}
