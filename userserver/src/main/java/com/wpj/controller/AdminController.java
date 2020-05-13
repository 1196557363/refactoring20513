package com.wpj.controller;

import com.wpj.entity.Organization;
import com.wpj.entity.User;
import com.wpj.service.IAdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author WuPeiJie
 * @date 2020/5/13 14:11
 * @version 1.0
 *     管理控制器
**/
@Controller
@RequestMapping(value = "/user/admin")
public class AdminController {

    @Resource
    private IAdminService adminService;

    @GetMapping(value = "/account")
    @ResponseBody
    public List<User> getAccount(){
       return adminService.getAccount();
    }

    @GetMapping(value = "hello")
    @ResponseBody
    public String hello(){
        return "adminService.getAccount();";
    }
}
