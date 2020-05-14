package com.wpj.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.wpj.dao.IPrivilegeApplyDao;
import com.wpj.entity.PrivilegeApply;
import com.wpj.entity.TableInfo;
import com.wpj.service.IPrivilegeApplyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author WuPeiJie
 * @version 1.0
 *
 **/
@Service
public class PrivilegeApplyServiceImpl implements IPrivilegeApplyService {

    @Resource
    private IPrivilegeApplyDao privilegeApplyDao;

    @Override
    public void addPrivilegeApply(PrivilegeApply privilegeApply) {
        // TODO 需要开始事务
        // TODO 查询 tableId 和 columns 的包含关系
        privilegeApplyDao.insert(privilegeApply);
    }

    @Override
    public List<TableInfo> getPrivilegeApply(String userId) {
        EntityWrapper wrapper = new EntityWrapper();
        wrapper.eq("userId", userId);
        return privilegeApplyDao.selectList(wrapper);
    }
}
