package com.yc.biz;

import com.yc.AppConfig;
import com.yc.dao.StudentDao;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class StudentBizImplTest {

    ApplicationContext ac;
    private StudentBizImpl studentBiz;

    @Before
    public void setup(){
        ac=new AnnotationConfigApplicationContext(AppConfig.class);
        studentBiz=(StudentBizImpl) ac.getBean("studentBizImpl");
    }

    @Test
    public void testadd() {
        studentBiz.add("李四");
    }

    @Test
    public void testupdate() {
        studentBiz.update("李四");
    }
}