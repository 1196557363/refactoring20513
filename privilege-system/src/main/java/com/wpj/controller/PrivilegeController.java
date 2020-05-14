package com.wpj.controller;

import com.wpj.entity.PrivilegeApply;
import com.wpj.service.IPrivilegeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author WuPeiJie
 * @version 1.0
 **/
@Controller
public class PrivilegeController {

    @Resource
    private IPrivilegeService privilegeService;

    @GetMapping(value = "/privilege")
    public List<PrivilegeApply> getPrivilege(Long userId){
        return privilegeService.getPrivilege(userId);
    }


}
