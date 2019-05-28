package com.gerry.yitao.yitaoseckillwebapi;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(
        exclude = DataSourceAutoConfiguration.class,
        scanBasePackages = {"com.gerry.yitao"})
@EnableDubbo
public class YitaoSeckillWebApplication {


    public static void main(String[] args) {
        SpringApplication.run(YitaoSeckillWebApplication.class);
    }
}