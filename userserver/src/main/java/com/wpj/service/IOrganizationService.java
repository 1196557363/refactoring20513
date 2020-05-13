package com.wpj.service;

import com.wpj.entity.Organization;

import java.util.List;

/**
 * @author WuPeiJie
 * @date 2020/5/13 13:48
 * @version 1.0
 *     管理服务
**/
public interface IOrganizationService {
    /**
     * 获取组织列表
     * @return
     */
    List<Organization> getOrganization();

    /**
     * 添加组织
     * @param organization
     */
    void addOrganization(Organization organization);

    /**
     * 删除组织
     * @param id
     */
    void deleteOrganization(Long id);
}
