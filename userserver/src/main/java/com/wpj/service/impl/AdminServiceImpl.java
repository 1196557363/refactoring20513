package com.wpj.service.impl;

import com.wpj.dao.IAdminDao;
import com.wpj.entity.User;
import com.wpj.service.IAdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author WuPeiJie
 * @date 2020/5/13 14:16
 * @version 1.0
 *     管理服务实现类
**/
@Service
public class AdminServiceImpl implements IAdminService {

    @Resource
    private IAdminDao adminDao;

    @Override
    public List<User> getAccount() {
        return adminDao.selectList(null);
    }

    @Override
    public void deleteUser(List<Long> userIdList) {
        adminDao.deleteBatchIds(userIdList);
    }


}
