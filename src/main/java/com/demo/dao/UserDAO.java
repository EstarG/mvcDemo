/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.demo.dao;

import java.util.List;

import com.demo.domain.UserDO;

/**
 * 
 * @author baoxing.gbx
 * @version $Id: UserDAO.java, v 0.1 2015年8月15日 下午10:24:23 baoxing.gbx Exp $
 */
public interface UserDAO {

    public int add(UserDO userDO);

    public List<UserDO> queryAll();
}
