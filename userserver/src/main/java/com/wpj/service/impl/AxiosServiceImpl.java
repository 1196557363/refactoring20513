package com.wpj.service.impl;

import com.wpj.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;

/**
 * @author WuPeiJie
 * @version 1.0
 **/
@Service
public class AxiosServiceImpl {

    @Value(value = "${META_BASE_URL}")
    private String META_BASE_URL;

    /**
     *  获取当前用户
     * @return
     */
       public Cookie getMetaBaseCurrent(Cookie cookie){
            String url = META_BASE_URL + "/api/user/current";
            String method = "GET";
            // TODO 传[ url, method, cookie ] 请求前端 获取当前用户
            return new Cookie("", "");
        }

    /**
     * 激活用户
     * @param id
     * @param cookie
     */
    public void reactivateMetaBaseUser(long id, Cookie cookie) {
        String url = META_BASE_URL + "/api/user/current";
        String method = "PUT";
        // TODO 传[ url, method, cookie ] 请求前端 激活当前用户
    }

    /**
     * 获取metabase的cookies
     * @param username
     * @param password
     * @return
     */
    public Cookie getMetaBaseCookie(String username, String password) {
        String url = META_BASE_URL + "/api/session";
        String method = "POST";
        // TODO 传[ url, method, username, password ] 请求前端 获取metabase的cookies
        return new Cookie("", "");
    }

    /**
     * 创建 metabase 用户
     * @param email
     * @param code
     * @param cookie
     * @return
     */
    public Long addMetaBaseUser(String email, String code, Cookie cookie) {
        // 邮箱名字和后缀分割成 firstName, lastName
        // TODO 目前不知道为什么要切割
        String[] split = email.split("@");
        String url = META_BASE_URL+"/api/user";
        String method = "POST";

        // TODO 传[ email, email的前缀(split[0]), email的后缀(split[1])
        //  url, method, cookiess ] 请求前端 创建 metabase 用户
        return 1L;
    }

    /**
     * 创建 metabase 用户的默认仪表盘
     * @param l
     * @param description
     * @param name
     * @param cookie
     */
    public void addMetaBaseDashboard(long l, String description, String name, Cookie cookie) {
        Long collection_id = l;
        String url = META_BASE_URL+"/api/dashboard";
        String method = "POST";
        // TODO 传[ url, method, collection_id,  description, name, cookie ] 请求前端 创建 metabase 用户的默认仪表盘
    }
}
