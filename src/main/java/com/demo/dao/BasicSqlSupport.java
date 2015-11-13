/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.demo.dao;

import org.apache.ibatis.session.SqlSession;

/**
 * 
 * @author baoxing.gbx
 * @version $Id: BasicSqlSupport.java, v 0.1 2015年8月15日 下午10:27:20 baoxing.gbx Exp $
 */
public class BasicSqlSupport {
    protected SqlSession session;

    public SqlSession getSession() {
        return session;
    }

    public void setSession(SqlSession session) {
        this.session = session;
    }

}
