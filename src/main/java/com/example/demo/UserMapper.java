package com.example.demo;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {	
	public List<UserDTO> selectUserList();
	public UserDTO readUser(String userId);	
	public void createUser(UserDTO userDTO);
}