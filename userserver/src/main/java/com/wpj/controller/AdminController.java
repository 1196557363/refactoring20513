package com.wpj.controller;

import com.wpj.entity.Organization;
import com.wpj.service.IOrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.wpj.entity.User;
import com.wpj.service.IAdminService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author WuPeiJie
 * @date 2020/5/13 13:47
 * @version 1.0
 *     管理控制器
 **/
@Controller
@RequestMapping(value = "/user/admin")
public class AdminController {

    @Resource
    private IOrganizationService organizationService;

    @GetMapping(value = "/organization")
    @ResponseBody
    public List<Organization> getOrganization(){
        return organizationService.getOrganization();
    }

    /**
     * TODO 不知道是传一个对象 还是传多个参数 暂设为对象
     * @param organization
     */
    @PostMapping(value = "/organization")
    @ResponseBody
    public void addOrganization(Organization organization){
        // TODO 会先校验下organization的name [ invalid_key_parameter ]
        organizationService.addOrganization(organization);
    }

    @DeleteMapping(value = "/organization")
    @ResponseBody
    public void deleteOrganization(Long id){
        // TODO 验证下id [ invalid_key_parameter ]
        organizationService.deleteOrganization(id);
        // TODO 设置状态204 ctx.status = 204;
    }

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
