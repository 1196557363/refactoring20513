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

}
