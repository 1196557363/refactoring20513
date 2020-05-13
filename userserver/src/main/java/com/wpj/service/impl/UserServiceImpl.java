package com.wpj.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.wpj.dao.IAccessDao;
import com.wpj.entity.User;
import com.wpj.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author WuPeiJie
 * @version 1.0
 *     用户服务实现类
**/
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private IAccessDao accessDao;

    @Override
    public User login(String code) {
        // TODO  去UMS校验授权获取tokenInfo包装请求消息
//      xxx tokenInfo = axios.getUMSTokenInfo(code)

        String userInfo =null;
        User user = null;
        /**
         // 如果状态为0000
        if(tokenInfo.msgCode == "0000") {
            userInfo = axios.getUMSUserInfo(tokenInfo.access_token);

        } else if(tokenINFO.msgCode == "0000" ||
            (config.ALLOW_NON_REGULAR_USER || userINFO.loginUser.user.employeeclassZhCn == "正式在职")){
            EntityWrapper<User> wrapper = new EntityWrapper();
            wrapper.eq("email", userInfo.loginUser.user.userEmail);
            user = accessDao.selectList(wrapper).get(0);

            // 判断用户是否为空 及 用户是否为无效状态
            if(user == null || user.getIsDeleted() == 1) {
                System.out.println("Error UserServiceImpl.login [ backend_msg_no_such_user ]");
                return null;
            }
            return user;
        }
        else {
            System.out.println("Error UserServiceImpl.login [ backend_msg_bgi_token_err ]");
            return null;
        }

        */

        return null;
    }
}
