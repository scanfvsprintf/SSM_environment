package com.xjj.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class MyAdvice {
	@Before("com.xjj.service.s()")
	public void d() {
		System.out.println("d");
	}
}
