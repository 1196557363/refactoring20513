package com.wpj.service;


import com.wpj.entity.User;

/**
 * @author WuPeiJie
 * @date 2020/5/13 13:40
 * @version 1.0
 *     访问服务
**/
public interface IAccessService {

    /**
     * 判断该用户的组织是否存在
     * @param organization  用户的组织id
     * @return 存在返回 true
     */
    Boolean isOrganizationExist(Long organization);

    /**
     * 根据用户邮箱信息查询用户
     * @param email 邮箱信息
     * @return 存在返回用户对象
     */
    User getUserByEmail(String email);

    /**
     * 根据用户对象注册
     * @param user 用户对象
     */
    void register(User user);
}
