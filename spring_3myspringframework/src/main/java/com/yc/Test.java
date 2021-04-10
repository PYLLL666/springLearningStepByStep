package com.yc;

import com.yc.bean.HelloWorld;
import com.yc.springframework.context.MyAnnotationConfigApplicationContext;
import com.yc.springframework.context.MyApplicationContext;

import java.lang.reflect.InvocationTargetException;

/**
 * @program: TestSpring
 * @description:
 * @author: Dale
 * @create: 2021-04-05 15:07
 */
public class Test {
    public static void main(String [] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        MyApplicationContext ac=new MyAnnotationConfigApplicationContext(MyAppConfig.class);
        HelloWorld hw= (HelloWorld) ac.getBean("hw");
        hw.show();
    }
}
