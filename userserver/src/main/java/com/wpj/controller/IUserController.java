package com.wpj.controller;

import com.wpj.entity.User;
import com.wpj.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author WuPeiJie
 * @version 1.0
 *     用户控制器
**/
@Controller
@RequestMapping("/user/access")
public class IUserController {

    @Resource
    private IUserService userService;

    @PostMapping(value = "/login")
    public User login(String code){
        if(code == null || "".equals(code)){
            // TODO 当code未输入时返回UIMS登入链接
        }
        return userService.login(code);
    }



}
