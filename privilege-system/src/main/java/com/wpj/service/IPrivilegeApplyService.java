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
     * @return
     */
    List<TableInfo> getPrivilegeApply(String userId);

    /**
     * 获取申请详情
     * @return
     * @param id
     */
    PrivilegeApply getPrivilegeApplyInfo(Long id);
}
