package com.wpj.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.wpj.entity.PrivilegeApply;
import com.wpj.entity.TableInfo;
import com.wpj.service.IPrivilegeApplyService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import javax.annotation.Resource;
import java.util.List;

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
    public void addPrivilegeApply(Long userId, PrivilegeApply privilegeApply){
        // TODO 检验数据 [ OAId, tableId, columns ]
        privilegeApply.setUserId(userId);
        privilegeApplyService.addPrivilegeApply(privilegeApply);
        // TODO 设置状态  ctx.status = 204;
    }

    @GetMapping(value = "/privilegeApply")
    public List<TableInfo> getPrivilegeApply(String userId){
        return privilegeApplyService.getPrivilegeApply(userId);
    }

    @GetMapping(value = "/privilegeApply/{id}")
    public PrivilegeApply getPrivilegeApplyInfo(@PathVariable Long id){
        // TODO 检查是否是本人或者管理员
        return privilegeApplyService.getPrivilegeApplyInfo(id);
    }

    @PutMapping(value = "/privilegeApply/{id}/cancel")
    public void updatePrivilegeApply(@PathVariable Long id){
        privilegeApplyService.updatePrivilegeApply(id);
    }

    @PostMapping(value = "/privilegeApply/{id}")
    public void reapplyPrivilegeApply(@PathVariable Long id){
        privilegeApplyService.updatePrivilegeApply(id);
    }

}
