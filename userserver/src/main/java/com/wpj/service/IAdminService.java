package com.wpj.service;

import java.util.List;

/**
 * @author WuPeiJie
 * @version 1.0
 * @date 2020/5/13 15:02
 *      管理服务接口
 **/
public interface IAdminService {

    /**
     * 根据id集合删除用户
     * @param userIdList
     */
    void deleteUser(List<Long> userIdList);
}
