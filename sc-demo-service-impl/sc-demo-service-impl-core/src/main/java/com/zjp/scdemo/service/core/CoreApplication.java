package com.zjp.scdemo.service.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 创建时间 2019年九月11日 星期三 19:37
 * 作者: zhangjunping
 */
@SpringBootApplication
@EnableFeignClients
public class CoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoreApplication.class,args);
    }
}
