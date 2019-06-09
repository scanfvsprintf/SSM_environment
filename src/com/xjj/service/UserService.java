package com.xjj.service;

import java.util.List;

import javax.annotation.Resource;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

import com.xjj.mapper.UserMapper;
import com.xjj.pojo.User;

@Service

public class UserService {
	
	@Resource
	private UserMapper usermapper;
	@Pointcut("excution(* com.xjj.Service...(..)")
	public List<User> getUsers(){
		return usermapper.getUser();
	}
	@Pointcut("excution(* com.xjj.Service...(..)")
	public void s() {
		System.out.println("s");
	}
}
