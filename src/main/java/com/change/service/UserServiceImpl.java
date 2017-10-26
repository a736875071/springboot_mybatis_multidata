package com.change.service;

import com.change.dao.test.TestUsersDao;
import com.change.dao.test1.Test1UsersDao;
import com.change.entity.test.TestUsers;
import com.change.entity.test1.Test1Users;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author YangQing
 * @version 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private TestUsersDao testUsersDao;
    @Autowired
    private Test1UsersDao test1UsersDao;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(TestUsers record) {
        return 0;
    }

    @Override
    public int insertSelective(TestUsers record) {
        return 0;
    }

    @Override
    public TestUsers selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(TestUsers record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(TestUsers record) {
        return 0;
    }

    @Override
    public String selectAll() {
        List<Test1Users> test1Users=   test1UsersDao.selectAll();
        List<TestUsers> testUsers=  testUsersDao.selectAll();
        return "Test1Users:"+new Gson().toJson(test1Users)
                +"-------------------------------------------------------"
                +"TestUsers:"+new Gson().toJson(testUsers);
    }

    @Override
    @Transactional
    public void userTransaction() {
        notUserTransaction();

    }

    @Override
    public void notUserTransaction() {
        TestUsers testUsers=new TestUsers();
        Long time=new Date().getTime();
        testUsers.setId(time);
        testUsers.setUserName(time.toString());
        testUsers.setPassWord(time.toString());
        testUsers.setUserName(time.toString());
        testUsers.setUser_sex(time.toString());
        testUsersDao.insert(testUsers);
        int a=1/0;
    }
}
