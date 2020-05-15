package com.wpj.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.wpj.dao.IUserMetabaseDao;
import com.wpj.entity.UserMetabase;
import com.wpj.utils.UserUtil;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;

/**
 * @author WuPeiJie
 * @version 1.0
 **/
public class MetaBaseServiceImpl {

    @Resource
    private AxiosServiceImpl axiosService;

    @Resource
    private IUserMetabaseDao userMetabaseDao;

    void createMetaBaseUser(String email, Long id){
        // 根据邮箱找到用户
        EntityWrapper<UserMetabase> wrapper = new EntityWrapper();
        wrapper.eq("email", email);
        UserMetabase userMetabase = userMetabaseDao.selectList(wrapper).get(0);
        // 获取管理员cookie
        Cookie cookie = getAdminCookies();
        UserMetabase dbUser = new UserMetabase();
        if(userMetabase != null ){
            // 尝试激活用户
            try {
                axiosService.reactivateMetaBaseUser(userMetabase.getId(), cookie);
            }catch (Exception e) {
                System.err.println("Error MetaBaseServiceImpl.createMetaBaseUser failure");
            }
        } else {
            // 生成随机密码
            String code = UserUtil.generateToken();
            // 新增用户
            Long dbId = axiosService.addMetaBaseUser(email, code, cookie);
            dbUser.setId(dbId);
            dbUser.setEmail(email);
            dbUser.setCode(code);
            dbUser.setUserId(id);
            userMetabaseDao.insert(dbUser);

        }
        // 新增用户个人仪表盘
        try {
            createDashboard(dbUser);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("MetaBaseServiceImpl.createMetaBaseUser [ createDashboard failure ]");
        }



    }

    /**
     * 新增用户个人仪表盘
     * @param userMetabase
     */
    void createDashboard(UserMetabase userMetabase) {
        Cookie metaBaseCookie = axiosService.getMetaBaseCookie(userMetabase.getEmail(), userMetabase.getCode());
        // TODO "metabase.SESSION" + metaBaseCookie.getId();
        Cookie cookie = null ;
        Cookie user =axiosService.getMetaBaseCurrent(cookie);
        String description = "个人仪表盘";
        String name = "个人仪表盘";
                                //user.personal_collection_id
        axiosService.addMetaBaseDashboard(1L, description, name, cookie);

    }


    /**
     * 获取管理员cookie
     */
    Cookie getAdminCookies(){
        try {
            // TODO 大概是根据CookieId获取值 ParamConstant.META_BASE_COOKIE
            Cookie cookie = null;
            return axiosService.getMetaBaseCurrent(cookie);
        } catch (Exception e) {
            if(1 == 1) {
                // 管理员登录失效，刷新 cookie
                refreshCookies();
            } else {
                System.err.println("Error MetaBaseServiceImpl.getAdminCookies [ create meta_base user error ]");
            }
        }
        return null;

    }

    /**
     * 激活用户
     */
    Long refreshCookies() {
        // TODO 大概是根据CookieId获取值 ParamConstant.META_BASE_USER和ParamConstant.META_BASE_PD
        String username = null;
        String password = null;
        Cookie c = axiosService.getMetaBaseCookie(username, password);
        // TODO 通过获取metabase的cookies更新Session
        // TODO 返回Session的id;
        return 1L;
    }


}
