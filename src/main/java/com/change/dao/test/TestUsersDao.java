package com.change.dao.test;

import com.change.entity.test.TestUsers;

import java.util.List;

public interface TestUsersDao {
    int deleteByPrimaryKey(Long id);

    int insert(TestUsers record);

    int insertSelective(TestUsers record);

    TestUsers selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TestUsers record);

    int updateByPrimaryKey(TestUsers record);

    List<TestUsers> selectAll();
}