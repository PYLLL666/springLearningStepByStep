package com.yc;

import com.yc.bean.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @program: TestSpring
 * @description:
 * @author: Dale
 * @create: 2021-04-05 14:49
 */
@Configuration
@ComponentScan(basePackages={"com.yc"})
public class MyAppConfig {

    @Bean
    public HelloWorld hw(){
        return new HelloWorld();
    }

    @Bean
    public HelloWorld hw2(){
        return new HelloWorld();
    }

}
