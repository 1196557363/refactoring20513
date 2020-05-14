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

    /**
     * 添加申请
     * @param userId
     * @param privilegeApply
     */
    @PostMapping(value = "/privilegeApply")
    public void addPrivilegeApply(Long userId, PrivilegeApply privilegeApply){
        // TODO 检验数据 [ OAId, tableId, columns ]
        privilegeApply.setUserId(userId);
        privilegeApplyService.addPrivilegeApply(privilegeApply);
        // TODO 设置状态  ctx.status = 204;
    }

    /**
     * 根据userId获取申请
     * @param userId
     * @return
     */
    @GetMapping(value = "/privilegeApply")
    public List<TableInfo> getPrivilegeApply(Long userId){
        return privilegeApplyService.getPrivilegeApply(userId, null);
    }

    /**
     * 获取申请列表
     * @param id
     * @return
     */
    @GetMapping(value = "/privilegeApply/{id}")
    public PrivilegeApply getPrivilegeApplyInfo(@PathVariable Long id){
        // TODO 检查是否是本人或者管理员
        return privilegeApplyService.getPrivilegeApplyInfo(id);
    }

    /**
     * 撤回申请
     * @param id
     */
    @PutMapping(value = "/privilegeApply/{id}/cancel")
    public void updatePrivilegeApply(@PathVariable Long id){
        privilegeApplyService.updatePrivilegeApply(id);
    }

    /**
     * 重新申请
     * @param id
     */
    @PostMapping(value = "/privilegeApply/{id}")
    public void reapplyPrivilegeApply(@PathVariable Long id){
        privilegeApplyService.updatePrivilegeApply(id);
    }

    /**
     * 管理员获取所有非撤回状态的申请
     * @return
     */
    @GetMapping(value = "/privilegeAllApply")
    public List<TableInfo> getPrivilegeAllApply(){
        // TODO 检查admin权限
        return privilegeApplyService.getPrivilegeApply(null, 1L);
    }

    /**
     * 管理员审核申请
     */
    @PutMapping(value = "/privilegeApply/{id}")
    public void approvalPrivilegeApply(@PathVariable Long id, PrivilegeApply privilegeApply){
        privilegeApplyService.approvalPrivilegeApply(id, privilegeApply);
    }


}
