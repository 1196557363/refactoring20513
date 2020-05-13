package com.wpj.controller;

import com.wpj.entity.User;
import com.wpj.service.IAccessService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author WuPeiJie
 * @date 2020/5/13 13:32
 * @version 1.0
 *     访问控制器
 **/
@Controller
@RequestMapping(value = "/user/access")
public class AccessController {
    @Resource
    private IAccessService accessService;

    /**
     * TODO user.getOrganization() 这里应该是Long类型的organizationId
     * @param user
     */
    @PostMapping(value = "/register")
    public void register(User user) {
        // TODO 会先校验数据 可以在前端校验
        // 判断组织是否存在
        Boolean exists = accessService.isOrganizationExist(user.getOrganization());
        if (exists) {
            // 如果存在就去判断该邮箱对应的用户是否存在
            User exUser = accessService.getUserByEmail(user.getEmail());
            // 如果不存在 则注册该用户
            if(exUser == null) {
                accessService.register(user);
            }
        }
    }
}
