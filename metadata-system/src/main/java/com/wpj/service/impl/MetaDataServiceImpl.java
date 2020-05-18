package com.wpj.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.wpj.constant.PrivilegeApplyConstants;
import com.wpj.dao.IMetaDataDao;
import com.wpj.dao.IPrivilegeApplyDao;
import com.wpj.entity.PrivilegeApply;
import com.wpj.entity.TableInfo;
import com.wpj.result.ResultEntity;
import com.wpj.service.IMetaDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author WuPeiJie
 * @version 1.0
 *     元数据服务实现类
**/
@Service
public class MetaDataServiceImpl implements IMetaDataService {

    @Resource
    private IMetaDataDao metaDataDao;

    @Resource
    private IPrivilegeApplyDao privilegeApplyDao;

    @Override
    public ResultEntity<Object> getTable(Integer from, Integer to, Integer currentPage, Integer pageSize, String tableName, String columnsName, Integer sort, Long userId) {

        EntityWrapper<TableInfo> wrapper = new EntityWrapper();
        if(from != null ){
            wrapper.gt("createdAt", from);
        }
        if(to != null ) {
            wrapper.lt("updatedAt", to);
        }
        // currentPage & pageSize必须同时输入才有用
        if(currentPage != null && pageSize != null ){
            wrapper.last("limit " + (currentPage-1) +", " + pageSize);
        }
        wrapper.eq("enName", tableName);
//        wrapper.eq("zhName", columnsName);
//        wrapper.eq("sort", sort);

        List<TableInfo> tableInfos = metaDataDao.selectList(wrapper);

        List<String> ids = new ArrayList<>();
        for (TableInfo tableInfo : tableInfos) {
            ids.add(tableInfo.getId());
        }
        //
        EntityWrapper<PrivilegeApply> pWrapper = new EntityWrapper<>();
//        pWrapper.eq("userId", userId);
        pWrapper.eq("status", PrivilegeApplyConstants.STATUS_SUCCESS);
        pWrapper.eq("tableId", tableName);
//        pWrapper.eq("expiredAt", System.currentTimeMillis() / 1000);

        List<PrivilegeApply> privilegeApplies = privilegeApplyDao.selectList(pWrapper);

        ResultEntity<Object> result = new ResultEntity<>();
        result.setData(privilegeApplies);

        return result;
    }


}
