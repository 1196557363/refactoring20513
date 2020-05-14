package com.wpj.service;

import com.wpj.entity.PrivilegeApply;
import com.wpj.entity.TableInfo;

import java.util.List;

/**
 * @author WuPeiJie
 * @version 1.0
 *
 **/
public interface IPrivilegeApplyService {
    /**
     * 新增申请记录
     * @param privilegeApply
     */
    void addPrivilegeApply(PrivilegeApply privilegeApply);

    /**
     * 获取申请列表
     * @param userId
     * @param isDeleted 是否只获取非撤回的
     * @return
     */
    List<TableInfo> getPrivilegeApply(Long userId, Long isDeleted);

    /**
     * 获取申请详情
     * @return
     * @param id
     */
    PrivilegeApply getPrivilegeApplyInfo(Long id);

    /**
     * 更改申请 [撤销, 重申]
     * @param id
     */
    void updatePrivilegeApply(Long id);

    /**
     * 管理员审核申请
     * @param id
     * @param privilegeApply
     */
    void approvalPrivilegeApply(Long id, PrivilegeApply privilegeApply);
}
