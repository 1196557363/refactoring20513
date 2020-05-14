package com.wpj.service;

import com.wpj.entity.PrivilegeApply;

import java.util.List;

/**
 * @author WuPeiJie
 * @version 1.0
 **/
public interface IPrivilegeService {
    /**
     * 获取自己的权限
     * @return
     * @param userId
     */
    List<PrivilegeApply> getPrivilege(Long userId);
}
