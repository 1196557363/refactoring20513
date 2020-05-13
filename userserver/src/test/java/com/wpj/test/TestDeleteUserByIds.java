package com.wpj.test;

import com.wpj.service.IAdminService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestDeleteUserByIds {

    @Resource
    private IAdminService adminService;

    @Test
    public void test(){

        List<Long> ids = new ArrayList<>();
        ids.add(139L);
        ids.add(140L);

        adminService.deleteUser(ids);
        System.out.println("删除成功");
    }

}
