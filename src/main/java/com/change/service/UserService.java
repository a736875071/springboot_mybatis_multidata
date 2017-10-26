package com.change.service;

import com.change.entity.test.TestUsers;

import java.util.List;

/**
 * @author YangQing
 * @version 1.0.0
 */

public interface UserService {

    int deleteByPrimaryKey(Long id);

    int insert(TestUsers record);

    int insertSelective(TestUsers record);

    TestUsers selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TestUsers record);

    int updateByPrimaryKey(TestUsers record);

    String selectAll();

    void userTransaction();

    void notUserTransaction();
}
