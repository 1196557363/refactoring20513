package com.wpj.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.wpj.dao.IPrivilegeDao;
import com.wpj.entity.PrivilegeApply;
import com.wpj.service.IPrivilegeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author WuPeiJie
 * @version 1.0
 **/
@Service
public class PrivilegeServiceImpl implements IPrivilegeService {

    @Resource
    private IPrivilegeDao privilegeDao;

    @Override
    public List<PrivilegeApply> getPrivilege(Long userId) {
        EntityWrapper<PrivilegeApply> wrapper = new EntityWrapper<>();
        wrapper.eq("userId", userId);
        wrapper.eq("status", 2L);
        List<PrivilegeApply> privilegeApplies = privilegeDao.selectList(wrapper);
        return privilegeApplies;
    }
}
