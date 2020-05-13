package com.wpj.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.wpj.dao.IAdminDao;
import com.wpj.entity.User;
import com.wpj.service.IAdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author WuPeiJie
 * @version 1.0
 *     管理服务实现类
**/
@Service
public class AdminServiceImpl implements IAdminService {

    @Resource
    private IAdminDao adminDao;

    @Override
    public User modifyUser(String department, Long id) {
        User user = adminDao.selectById(id);
        if(user != null) {
            user.setDepartment(department);
            Integer flag = adminDao.updateById(user);
            if(flag == 1) {
                System.out.println("Info AdminServiceImpl.modifyUser [ Update User Success ]");
            }
            return user;
        }
        System.err.println("Error AdminServiceImpl.modifyUser [ backend_msg_no_such_user ]");
        return null;
    }
}
