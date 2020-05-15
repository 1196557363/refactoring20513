package com.wpj.constant;

/**
 * @author WuPeiJie
 * @version 1.0
 **/
public @interface PrivilegeApplyConstants {
    /**
     * 审核中
     */
    Integer STATUS_PENDING = 1;

    /**
     * 审批通过
     */
    Integer STATUS_SUCCESS = 2;

    /**
     * 审批退回
     */
    Integer STATUS_FAILS = 3;

    /**
     * 已撤回
     */
    Integer STATUS_CANCEL = 10;

    /**
     * 查看权限
     */
    Integer TYPE_READ = 1;

    /**
     * 下载权限
     */
    Integer TYPE_DOWNLOAD = 2;

    /**
     * 失效日期类型 具体时间
     */
    Integer EXPIRED_TYPE_DAY = 1;

    /**
     * 失效日期类型 快速选择
     */
    Integer EXPIRED_TYPE_DATE = 2;
}
