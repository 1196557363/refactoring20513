package com.wpj.service;

import com.wpj.entity.PrivilegeApply;
import com.wpj.result.ResultEntity;

import java.util.List;

/**
 * @author WuPeiJie
 * @version 1.0
 *
 **/
public interface IMetaDataService {
    /**
     * 获取元数据表格列表
     * @param from  时间
     * @param to    时间
     * @param currentPage   分页信息 [currentPage&pageSize必须同时输入才有用]
     * @param pageSize      分页信息 [currentPage&pageSize必须同时输入才有用]
     * @param tableName     TableInfo [ enName=tableName ]
     * @param columnsName   TableInfo [ zhName=columnsName ]
     * @param sort          TableInfo [ sort ]
     * @param userId        当前登录的用户的id
     * @return  Data数据
     */
    Object getTable(Integer from, Integer to, Integer currentPage, Integer pageSize, String tableName, String columnsName, Integer sort, Long userId);


}
