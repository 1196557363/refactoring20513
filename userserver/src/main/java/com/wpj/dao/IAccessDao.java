package com.wpj.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.wpj.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author WuPeiJie
 * @date 2020/5/13 13:41
 * @version 1.0
 *     访问Dao
**/
public interface IAccessDao extends BaseMapper<User> {
    /**
     * 添加User到数据库中
     * @param user 用户信息
     * @param role 用户角色
     * @return
     */
    void createUser(@Param(value = "user") User user, @Param(value = "role") Integer role);
}
