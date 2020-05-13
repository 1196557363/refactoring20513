package com.wpj.test;

import com.wpj.dao.IAdminDao;
import com.wpj.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestUpdate {

    @Resource
    private IAdminDao adminDao;

    @Test
    public void test(){

        User user = adminDao.selectById(141L);
        user.setDepartment("2");
        adminDao.updateById(user);


    }

}
