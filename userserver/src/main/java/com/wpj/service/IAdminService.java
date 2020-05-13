package com.wpj.service;

import com.wpj.entity.User;

/**
 * @author WuPeiJie
 * @version 1.0
 *      管理服务接口
 **/
public interface IAdminService {

    /**
     * 修改用户信息
     * @param department
     * @param id
     * @return
     */
    User modifyUser(String department, Long id);
}
