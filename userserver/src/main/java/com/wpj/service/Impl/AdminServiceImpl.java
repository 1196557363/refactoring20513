package com.wpj.service.Impl;

import com.wpj.dao.IAdminDao;
import com.wpj.service.IAdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author WuPeiJie
 * @date 2020/5/13 15:03
 * @version 1.0
 *     管理服务实现类
**/
@Service
public class AdminServiceImpl implements IAdminService {

    @Resource
    private IAdminDao adminDao;

    @Override
    public void deleteUser(List<Long> userIdList) {
        // TODO 需要开启事务
        // TODO 需要调用基础服务停用metebase用户
        adminDao.deleteBatchIds(userIdList);
    }
}
