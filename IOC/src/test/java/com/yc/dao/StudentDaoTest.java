package com.yc.dao;

import com.yc.biz.StudentBizImpl;
import junit.framework.TestCase;

public class StudentDaoTest extends TestCase{

    private StudentDao studentDao;
    private StudentBizImpl studentBizImpl;

    @Override
    public void setUp() throws Exception{
        studentDao =new StudentDaoJpaImpl();

        studentBizImpl =new StudentBizImpl();

        studentBizImpl.setStudentDao(studentDao);
    }

    public void testAdd() {
        studentDao.add("张三");
    }

    public void testUpdate(){
        studentDao.update("张三");
    }

    public void testBizAdd(){
        studentBizImpl.add("张三");
    }

}