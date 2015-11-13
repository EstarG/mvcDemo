/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.demo.web.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.dao.UserDAO;
import com.demo.domain.UserDO;

/**
 * 
 * @author baoxing.gbx
 * @version $Id: RegisterController.java, v 0.1 2015年8月17日 下午4:17:07 baoxing.gbx Exp $
 */
@Controller
@RequestMapping("/register.htm")
public class RegisterController {
    private static final Log LOGGER = LogFactory.getLog(LoginController.class);

    @Resource
    private UserDAO          userDAO;

    @RequestMapping(method = RequestMethod.POST)
    public String handlePost(HttpServletRequest request, ModelMap modelMap) throws Exception {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        LOGGER.info("name = " + name + "password = " + password);
        UserDO userDO = new UserDO();
        userDO.setName(name);
        userDO.setPassword(password);
        userDAO.add(userDO);

        modelMap.put("result", userDO);
        return "result";
    }

    /**
     * Setter method for property <tt>userDAO</tt>.
     * 
     * @param userDAO value to be assigned to property userDAO
     */
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
