package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserMapper userMapper;

	@GetMapping("/users")
	public ResponseEntity<List<UserDTO>> selectUserList(){
		return ResponseEntity.ok(userMapper.selectUserList());
	}

}
