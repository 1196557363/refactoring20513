package com.wpj.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.wpj.dao.IOrganizationDao;
import com.wpj.dao.IUserDao;
import com.wpj.entity.Organization;
import com.wpj.entity.User;
import com.wpj.service.IOrganizationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author WuPeiJie
 * @date 2020/5/12 20:11
 * @version 1.0
 *      组织服务实现类
**/
@Service
public class OrganizationServiceImpl implements IOrganizationService {

    @Resource
    private IOrganizationDao organizationDao;

    @Resource
    private IUserDao userDao;

    @Override
    public List<Organization> getOrganization() {
        return organizationDao.selectList(null);
    }

    @Override
    public void addOrganization(Organization organization) {
        // 判断新加的组织是否有父组织
        if(organization.getParentId() == 0) {
            System.err.println("Error OrganizationServiceImpl.addOrganization [ backend_msg_no_parent_organization_found ]");
            // TODO 不知道找不到父组织要不要终止添加
        }
        // 如果有父组织的话，给这个新增的组织设置路径
        Organization parentOrganization = organizationDao.selectById(organization.getParentId());
        organization.setPath(parentOrganization.getPath()+"/"+parentOrganization.getId());
        organizationDao.insert(organization);
    }

    @Override
    public void deleteOrganization(Long id) {
        // 查找组织
        Organization organization = organizationDao.selectById(id);
        if(organization == null) {
            System.out.println("Error OrganizationServiceImpl.deleteOrganization [ backend_msg_no_organization_found ]");
            return;
        }
        // 查找该组织下的所有组织
        String path = organization.getPath() + "/" + id;
        EntityWrapper<Organization> oWrapper = new EntityWrapper<Organization>();
        oWrapper.eq("path", path);
        List<Organization> organizationList = organizationDao.selectList(oWrapper);
        // 根据组织集合查找组织id
        List<Long> oIdList = new ArrayList<Long>();
        for(Organization o : organizationList) {
            oIdList.add(o.getId());
        }
        oIdList.add(id);
        // TODO 这里需要事务实现
        // 根据组织id查找该组织以及其下属组织的所有用户添加到userList中
        List<Long> uIdList = new ArrayList<>();
        for (int i = 0; i < oIdList.size(); i++){
            EntityWrapper<User> uWrapper = new EntityWrapper<User>();
            uWrapper.eq("organization", oIdList.get(i));
            for(User dbUser:userDao.selectList(uWrapper)){
                uIdList.add(dbUser.getId());
            }
        }
        // 删除userList下的所有用户
        userDao.deleteBatchIds(uIdList);

        // 删除组织id中的组织
        organizationDao.deleteBatchIds(oIdList);
    }
}
