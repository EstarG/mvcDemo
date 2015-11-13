/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.demo.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author baoxing.gbx
 * @version $Id: RegisterPageController.java, v 0.1 2015年8月17日 下午4:23:30 baoxing.gbx Exp $
 */
@Controller
@RequestMapping("/registerPage.htm")
public class RegisterPageController {

    @RequestMapping(method = RequestMethod.GET)
    public String handleGet(HttpServletRequest request, ModelMap modelMap) throws Exception {
        return "/register/register";
    }
}
