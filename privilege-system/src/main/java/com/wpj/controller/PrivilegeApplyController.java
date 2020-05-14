package com.wpj.controller;


import com.wpj.entity.PrivilegeApply;
import com.wpj.service.IPrivilegeApplyService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author WuPeiJie
 * @version 1.0
 *
**/
@Controller
public class PrivilegeApplyController {

    @Resource
    private IPrivilegeApplyService privilegeApplyService;

    @PostMapping(value = "/privilegeApply")
    public void addPrivilegeApply(PrivilegeApply privilegeApply){
        // TODO 检验数据 [ OAId, tableId, columns ]
        privilegeApplyService.addPrivilegeApply(privilegeApply);
        // TODO 设置状态  ctx.status = 204;
    }





}
