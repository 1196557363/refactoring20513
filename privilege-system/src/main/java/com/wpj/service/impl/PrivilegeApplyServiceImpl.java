package com.wpj.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.wpj.dao.IPrivilegeApplyDao;
import com.wpj.dao.ITableInfoDao;
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

    @Resource
    private ITableInfoDao tableInfoDao;

    @Override
    public void addPrivilegeApply(PrivilegeApply privilegeApply) {
        // TODO 需要开始事务
        // TODO 查询 tableId 和 columns 的包含关系
        privilegeApplyDao.insert(privilegeApply);
    }

    @Override
    public List<TableInfo> getPrivilegeApply(Long userId, Long isDeleted) {
        EntityWrapper wrapper = new EntityWrapper();
        // 用户获取自己的申请
        if(userId != null) {
            wrapper.eq("userId", userId);
        }
        // 管理员获取非撤回的申请
        if(isDeleted != null) {
            wrapper.eq("isDeleted", isDeleted);
        }
        return tableInfoDao.selectList(wrapper);
    }

    @Override
    public PrivilegeApply getPrivilegeApplyInfo(Long id) {
        PrivilegeApply privilegeApply = privilegeApplyDao.selectById(id);
        System.out.println(privilegeApply);
        return privilegeApply;
    }

    @Override
    public void updatePrivilegeApply(Long id) {
        PrivilegeApply privilegeApply = privilegeApplyDao.selectById(id);
        if(privilegeApply!= null) {
            if(privilegeApply.getIsDeleted() == 1) {
                privilegeApply.setIsDeleted(0);
            } else {
                privilegeApply.setIsDeleted(1);
            }
            EntityWrapper<PrivilegeApply> wrapper = new EntityWrapper<>();
            wrapper.eq("id", id);
            privilegeApplyDao.update(privilegeApply, wrapper);
            return;
        }
        System.err.println("Error PrivilegeApplyServiceImpl.updatePrivilegeApply [ PrivilegeApply is not found ]");
    }

    @Override
    public void approvalPrivilegeApply(Long id, PrivilegeApply privilegeApply) {
        PrivilegeApply p = privilegeApplyDao.selectById(id);
        if(p != null) {
            p.setStatus(privilegeApply.getStatus());
            p.setType(privilegeApply.getType());
            p.setAuditRemarks(privilegeApply.getAuditRemarks());
            EntityWrapper<PrivilegeApply> wrapper = new EntityWrapper<>();
            wrapper.eq("id", id);
            privilegeApplyDao.update(privilegeApply, wrapper);
            return;
        }
        System.err.println("Error PrivilegeApplyServiceImpl.updatePrivilegeApply [ PrivilegeApply is not found ]");

    }

}
