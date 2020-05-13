package com.wpj.constant;

/**
 * @author WuPeiJie
 * @date 2020/5/13 13:28
 * @version 1.0
 *     用户枚举
**/
public @interface UserConstant {
    /**
     * 管理权限
     */
    Integer PRIVATE_ADMIN = 1;
    /**
     * 普通权限
     */
    Integer PRIVATE_NORMAL = 2;
    /**
     * 普通用户
     */
    Integer ROLE_USER = PRIVATE_NORMAL;
    /**
     * 管理员
     */
    Integer ROLE_ADMIN = PRIVATE_NORMAL | PRIVATE_ADMIN;
}
