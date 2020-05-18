package com.wpj.service;

/**
 * @author WuPeiJie
 * @version 1.0
 **/
public interface ITableRelationService {
    /**
     * 获取元数据血缘关系
     * @param tableId tableId
     * @return Data数据
     */
    Object getTableConsanguinity(String tableId);
}
