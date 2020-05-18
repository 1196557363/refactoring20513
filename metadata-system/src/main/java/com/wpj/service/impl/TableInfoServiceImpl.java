package com.wpj.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.wpj.dao.ITableInfoDao;
import com.wpj.entity.PrivilegeApply;
import com.wpj.entity.TableInfo;
import com.wpj.result.ResultEntity;
import com.wpj.service.ITableInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author WuPeiJie
 * @version 1.0
 **/
@Service
public class TableInfoServiceImpl implements ITableInfoService {

    @Resource
    private ITableInfoDao tableInfoDao;

    @Override
    public ResultEntity getTableColumns(String tableId) {
        EntityWrapper<TableInfo> wrapper = new EntityWrapper<>();
        wrapper.eq("id", tableId);
        ResultEntity result = new ResultEntity<>();

        List<TableInfo> tableInfos = tableInfoDao.selectList(wrapper);
        if (tableInfos.size() == 0 && tableInfos == null){
            System.err.println("Error TableInfoServiceImpl.getTableColumns [ not_found_key ] ");
            return result;
        }
        result.setData(tableInfos);

        return result;
    }

    @Override
    public ResultEntity getTableInfo(String tableId) {
        TableInfo tableInfo = tableInfoDao.selectById(tableId);
        ResultEntity result = new ResultEntity<>();

        if (tableInfo == null) {
            return ResultEntity.fall("没有数据");
        }
        result.setData(tableInfo);

        return result;
    }
}
