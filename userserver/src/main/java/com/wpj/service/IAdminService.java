package com.wpj.service;

import com.wpj.entity.User;

import java.util.List;

/**
 * @author WuPeiJie
 * @date 2020/5/13 14:14
 * @version 1.0
 *     管理服务
 **/
public interface IAdminService {

    /**
     * 获取用户列表
     * @return
     */
    List<User> getAccount();

    /**
     * 根据id集合删除用户
     * @param userIdList
     */
    void deleteUser(List<Long> userIdList);

}
