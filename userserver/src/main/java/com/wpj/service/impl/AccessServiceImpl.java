package com.wpj.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.wpj.constant.UserConstant;
import com.wpj.dao.IAccessDao;
import com.wpj.dao.IOrganizationDao;
import com.wpj.entity.User;
import com.wpj.service.IAccessService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author WuPeiJie
 * @date 2020/5/13 13:40
 * @version 1.0
 *     访问服务实现类
**/
@Service
public class AccessServiceImpl implements IAccessService {

    @Resource
    private IAccessDao accessDao;

    @Resource
    private IOrganizationDao organizationDao;

    /**
     * @param organization 用户的组织id TODO 这里参数应该是organizationId
     * @return
     */
    @Override
    public Boolean isOrganizationExist(Long organization) {
        if(organization != null) {
            return organizationDao.selectById(organization) == null;
        }
        System.err.println("Error AccessServiceImpl.isOrganizationExist [ backend_msg_no_organization_found ]");
        return false;
    }

    @Override
    public User getUserByEmail(String email) {
        EntityWrapper<User> wrapper = new EntityWrapper();
        wrapper.eq("email", email);
        User dbUser = null;
        List<User> userList = accessDao.selectList(wrapper);
        if(!userList.isEmpty()) {
            dbUser = userList.get(0);
            if (dbUser.getIsDeleted() != 1L) {
                System.err.println("Error AccessServiceImpl.getUserByEmail [ email_address_used ]");
                return null;
            }
            // TODO 这里要调用基础服务.createMetaBaseUser()
        }
        return dbUser;
    }

    @Override
    public void register(User user) {
        Integer role = UserConstant.ROLE_USER;
        // TODO 下面2个操作要放在事务里面
        accessDao.createUser(user, role);
        // TODO 这里要调用基础服务.createMetaBaseUser()

    }
}
