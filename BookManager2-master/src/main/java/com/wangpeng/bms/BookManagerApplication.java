package com.wangpeng.bms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(value = "com.wangpeng.bms.mapper")
public class BookManagerApplication extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(BookManagerApplication.class, args);
    }

}
