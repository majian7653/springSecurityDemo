package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Deacription 用户认证中心配置启动类
 * @Author majian
 * @Date 2020/12/27
 * @Version 1.0
 **/

@SpringBootApplication
public class AuthServerMain {
    public static void main(String[] args) {
        System.out.println("呵呵哒！！！");
        SpringApplication.run(AuthServerMain.class, args);
    }
}
