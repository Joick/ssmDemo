package com.simpledemo.controller;

import com.simpledemo.entity.AdminRoles;
import com.simpledemo.model.role.RolesInsertModel;
import com.simpledemo.model.user.UserQueryModel;
import com.simpledemo.service.AdminRolesService;
import com.simpledemo.service.AdminUserService;
import com.simpledemo.utilities.JsonUtil;
import com.simpledemo.utilities.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.BinaryClient;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.simpledemo.utilities.RsaUtil.*;

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

    @PostMapping(value = "/decryptData")
    @ResponseBody
    public Result<List<String>> decryptData(@RequestBody UserQueryModel reqModel) {

        result = new Result<List<String>>();

        try {
            //String data = reqModel.getData();
            //String prKeyString = reqModel.getPrivateKey();

            //KeyPair key = initKey();

            PublicKey publicKey = string2PublicKey("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDnYVoTCJzzY6a9qods/SaRL6KtRMQzpJaWJAvHMer65J/8pl65cLtAXFWmHp3jgBMeVfKeSvGYUEx9/1nRPnY4q/1OuqDwipAgulDpw4tpFvIN7Z/XW+syRMTNBvdSHw5MnSSll6lP9oFxDkDs7GBLzYXT9KmUAByXYSJGNzI7vQIDAQAB");
            PrivateKey privateKey = string2PrivateKey("MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAOdhWhMInPNjpr2qh2z9JpEvoq1ExDOklpYkC8cx6vrkn/ymXrlwu0BcVaYeneOAEx5V8p5K8ZhQTH3/WdE+djir/U66oPCKkCC6UOnDi2kW8g3tn9db6zJExM0G91IfDkydJKWXqU/2gXEOQOzsYEvNhdP0qZQAHJdhIkY3Mju9AgMBAAECgYB8LeZu0q+RfMkPgAdAujjJsPwo7AA1Cz96gwwDM0o+rxciPJQYCGWm7CdXiZUJdUJNhKk6xVQWf/odoT8uKsy9Jk+PxNrWzgAxefX31GVYACUf0qCiIlGQRa3CVPQTHcLB+rdlAyzZ/Su+QvFXBCrkVTkfP3RiVearxzU0mDnqTQJBAOx2CBLqM2CLCrUPmN+Of1H0WjwsrZ3BlbuJN0Z0ZTbVXS9Gnmwmmw3J3oLF/2/hE01hnPBPqneGOE6M4ImevcsCQQD6f9ghhsb/kMSTOtq3oBjmeGg9oHUs8qnH5DksillKJUzfN4vBOfVyFwCji5DyOWsGlyLQw+aIZeorVHgEJ7uXAkAILQSWctaX7fbOz90/TZQFZ2d/USQnojvlIhdxLjEZtkLkkZKEtskBrwsshmAQpD2gnVFp1bdVLqTfwms5Fu4FAkAzkOu6Axel9nQw5rWthTx6/SBgR063wQBoULfgTl6RH9qSPMn9LeQz5z5PbGSbKGy6v5QAK8OiInCxGMNX/6HjAkAJf1NQkrXLx/kJ48tjmRc+S2MKfevYAB1FwLhrinPbQpNtAn+cURwOACiNZALuAA0gk8XtX09HHziVfodX66tP");

            RSAPrivateKey rsaPrivateKey=

            String reqData = "{\"mobile\":18405814768,\"password\":\"123456\"}";

            String encrypt = "rl01kUCh8f2vXq8G/rT9Rtv9muWw8L9k631RCm61mPCqvCo8n1HskxRiIOTvV5iczJi9lLBRp6IoxkPpFmpT7bj843YZDynxkuujPew13TByTxE1hb9t5CRALWZAsErPYM8u85Z0yZPrkSCm87ie8gNhMzYRAvCuIolULakil/A=";//byte2Base64(publicEncrypt(base642Byte(reqData), publicKey));

            //PrivateKey prKey = string2PrivateKey(prKeyString);

            String decryptData = byte2Base64(privateDecrypt(base642Byte(encrypt), privateKey));

            List<String> sli = new ArrayList<String>();

            sli.add(encrypt);
            sli.add(decryptData);

            result.success(sli);

        } catch (Exception e) {
            result.setMessage(e.getMessage());
        }

        return result;
    }

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
