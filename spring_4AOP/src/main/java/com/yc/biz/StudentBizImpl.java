package com.yc.biz;

import com.yc.MyAppConfig;
import com.yc.dao.StudentDao;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Random;

/**
 * @program: TestSpring
 * @description:
 * @author: Dale
 * @create: 2021-04-04 15:22
 */
@Service
public class StudentBizImpl {

    private StudentDao studentDao;

    public StudentBizImpl(StudentDao studentDao){
        this.studentDao=studentDao;
    }

    public StudentBizImpl(){

    }

    @Autowired
    @Qualifier("studentDaoJpaImpl")
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public int add(String name){
        System.out.println("=========业务层=========");
        System.out.println("用户名是否重名");
        int result=studentDao.add(name);
        System.out.println("=========业务操作结束=========");
        return result;
    }

    public void update(String name){
        System.out.println("=========业务层=========");
        System.out.println("用户名是否重名");
        studentDao.update(name);
        System.out.println("=========业务操作结束=========");
    }

    public void find(String name){
        System.out.println("=========业务层=========");
        System.out.println("业务层查找用户名："+name);
        studentDao.find(name);
        Random r=new Random();
        try {
            Thread.sleep(r.nextInt());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("=========业务操作结束=========");
    }

}
