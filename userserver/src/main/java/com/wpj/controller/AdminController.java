package com.wpj.controller;

import com.wpj.service.IAdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author WuPeiJie
 * @date 2020/5/13 14:59
 * @version 1.0
 *     管理控制器
**/
@Controller
@RequestMapping("/user/admin")
public class AdminController {

    @Resource
    private IAdminService adminService;

    @DeleteMapping(value = "/deleteUser")
    public void deleteUser(List<Long> userIdList){
        // TODO 检验参数 [ invalid_key_parameter ]
        adminService.deleteUser(userIdList);
        // TODO 设置状态 ctx.status = 204;
    }

}
