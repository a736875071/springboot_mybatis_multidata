package com.change.dao.test1;

import com.change.entity.test.TestUsers;
import com.change.entity.test1.Test1Users;

import java.util.List;

public interface Test1UsersDao {
    int deleteByPrimaryKey(Long id);

    int insert(Test1Users record);

    int insertSelective(Test1Users record);

    Test1Users selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Test1Users record);

    int updateByPrimaryKey(Test1Users record);

    List<Test1Users> selectAll();
}