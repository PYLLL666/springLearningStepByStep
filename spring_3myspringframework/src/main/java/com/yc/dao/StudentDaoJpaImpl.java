package com.yc.dao;

import java.util.Random;

/**
 * @program: TestSpring
 * @description:
 * @author: Dale
 * @create: 2021-04-04 14:59
 */
public class StudentDaoJpaImpl implements StudentDao{


    public int add(String name) {
        System.out.println("jpa 添加学生:"+name);
        Random r=new Random();
        return r.nextInt();
    }

    public void update(String name) {
        System.out.println("jpa更新学生："+name);
    }
}
