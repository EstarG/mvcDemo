package com.demo.dao.impl;

import java.util.List;

import com.demo.dao.BasicSqlSupport;
import com.demo.dao.UserDAO;
import com.demo.domain.UserDO;

public class UserDAOImpl extends BasicSqlSupport implements UserDAO {

    public int add(UserDO userDO) {
        return this.session.insert("com.demo.domain.UserDO.add", userDO);
    }

    public List<UserDO> queryAll() {
        return this.session.selectList("com.demo.domain.UserDO.select");
    }

}
