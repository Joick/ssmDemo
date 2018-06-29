package com.simpledemo.controller;

import com.simpledemo.model.role.RolesInsertModel;
import com.simpledemo.model.user.UserQueryModel;
import com.simpledemo.service.SysAdminRolesService;
import com.simpledemo.utilities.Result;
import com.simpledemo.entity.*;
import com.simpledemo.service.SysAdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Administrator
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private SysAdminUserService userService;

    @Autowired
    private SysAdminRolesService roleService;

//    @RequestMapping(value = "/detail", method = RequestMethod.POST, produces = {
//            "application/json; charset=utf-8"})
//    @ResponseBody
//    public Result<SysAdminUser> detail(@RequestBody UserQueryModel model) {
//
//        Result<SysAdminUser> result = new Result<SysAdminUser>();
//
//        long userId = model.getUserId();
//
//        if (userId == 0) {
//            result.fail("userId有误");
//
//            return result;
//        }
//
//        SysAdminUser user = userService.getUser(userId);
//
//        result.success(user);
//
//        return result;
//    }

    /**
     * 获取用户权限信息
     *
     * @param model
     * @return
     */
//    @RequestMapping(value = "/getUserRoles", method = RequestMethod.POST)
//    @ResponseBody
//    public Result<List<SysAdminRoles>> getUserRoles(@RequestBody UserQueryModel model) {
//
//        Result<List<SysAdminRoles>> result = new Result<List<SysAdminRoles>>();
//
//        long userId = model.getUserId();
//        if (userId == 0) {
//            result.fail("用户id不能为空");
//
//            return result;
//        }
//
//        List<SysAdminRoles> roles = roleService.listUserRoles(userId);
//
//        result.success(roles);
//
//        return result;
//    }

    /**
     * 获取权限列表
     *
     * @return
     */
    @RequestMapping(value = "/addRoles", method = RequestMethod.POST)
    @ResponseBody
    public Result<List<SysAdminRoles>> getRoles(@RequestBody RolesInsertModel reqModel) {

        Result<List<SysAdminRoles>> result = new Result<List<SysAdminRoles>>();

        List<SysAdminRoles> roles=reqModel.

        roleService.insertRoles()
        result.success();

        return result;
    }

}
