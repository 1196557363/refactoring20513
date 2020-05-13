package com.wpj.service;

import com.wpj.entity.User;

/**
 * @author WuPeiJie
 * @version 1.0
 *      用户服务接口
 **/
public interface IUserService {
    /**
     * 登录
     * @param code
     * @return
     */
    User login(String code);
}
