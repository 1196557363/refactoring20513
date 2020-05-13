package com.wpj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author WuPeiJie
 * @date 2020/5/13 13:26
 * @version 1.0
 *     用户服务启动类
**/
@SpringBootApplication(scanBasePackages = "com.wpj")
@MapperScan(basePackages = "com.wpj.dao")
public class UserserverApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserserverApplication.class, args);
    }
}
