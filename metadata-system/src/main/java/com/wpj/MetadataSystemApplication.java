package com.wpj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author WuPeiJie
 * @version 1.0
 *     元数据启动类
**/
@SpringBootApplication(scanBasePackages = "com.wpj")
@MapperScan(basePackages = "com.wpj.dao")
public class MetadataSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(MetadataSystemApplication.class, args);
    }

}
