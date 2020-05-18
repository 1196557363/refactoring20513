package com.wpj.service;

import com.wpj.entity.PrivilegeApply;
import com.wpj.result.ResultEntity;

/**
 * @author WuPeiJie
 * @version 1.0
 **/
public interface ITableInfoService {

    /**
     * 获取列详情
     * @param tableId tableId
     * @return  Data数据
     */
    ResultEntity getTableColumns(String tableId);

    /**
     * 获取表详情
     * @param tableId tableId
     * @return Data数据
     */
    ResultEntity getTableInfo(String tableId);
}
