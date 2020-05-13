package com.wpj.controller;

import com.wpj.entity.User;
import com.wpj.service.IAdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author WuPeiJie
 * @version 1.0
 *      管理控制器
**/
@Controller
@RequestMapping(value = "/user/admin")
public class AdminController {

    @Resource
    private IAdminService adminService;

    @PutMapping(value = "/user")
    public User modifyUser(String department, Long id){
        // TODO 检验参数
        return adminService.modifyUser(department, id);
    }

}
