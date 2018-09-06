package com.simpledemo.controller;

import com.simpledemo.utility.RedisUtil;
import com.simpledemo.utility.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Administrator
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    private final RedisUtil redisUtil = new RedisUtil();

    @PostMapping("redisTest")
    @ResponseBody
    public Result redisTest(){
        Result result = new Result();

        redisUtil.stringSet("kkk","this is a redis string setting test");

        return result;
    }

}
