package com.wpj.service;

import com.wpj.entity.PrivilegeApply;

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
}
