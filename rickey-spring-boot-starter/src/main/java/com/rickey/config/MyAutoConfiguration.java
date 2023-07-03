package com.rickey.config;

import com.rickey.pojo.SimpleBean;
import com.rickey.service.SimpleBeanService;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;


@AutoConfiguration
@ConditionalOnClass
@EnableConfigurationProperties(SimpleBean.class)
public class MyAutoConfiguration {

    static {
        System.out.println("MyAutoConfiguration init...");
    }

    @Bean
    SimpleBeanService simpleBeanService(SimpleBean simpleBean){
        return new SimpleBeanService(simpleBean);
    }

}
