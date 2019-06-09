package com.xjj.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.annotation.Resources;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xjj.pojo.User;
import com.xjj.service.UserService;

@Controller
public class Test {
	@Resource
	UserService userService;
	@RequestMapping("t")
	@ResponseBody
	public List<User> t() {
			userService.s();
			return userService.getUsers();
		
	}
}
