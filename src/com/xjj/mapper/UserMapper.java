package com.xjj.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.xjj.pojo.*;
public interface UserMapper {
	public List<User> getUser();
}
