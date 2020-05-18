package com.wpj.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.wpj.dao.ITableRelationDao;
import com.wpj.entity.TableRelation;
import com.wpj.service.ITableRelationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author WuPeiJie
 * @version 1.0
 **/
@Service
public class TableRelationServiceImpl implements ITableRelationService {

    @Resource
    private ITableRelationDao tableRelationDao;

    @Override
    public Object getTableConsanguinity(String tableId) {

        // TODO fromColumn == fromItem, fromTable == from
        // TODO toColumn == toItem, toTble == to
        // TODO where fromTable = ? or toTble = ?

        EntityWrapper<TableRelation> wrapper = new EntityWrapper();
        wrapper.eq("fromTable", tableId);
        wrapper.eq("toTble", tableId);

        List<TableRelation> tableRelations = tableRelationDao.selectList(wrapper);

        System.out.println(tableRelations);




        return null;
    }
}
