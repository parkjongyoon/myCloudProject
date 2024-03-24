package com.example.demo;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UserController {
	
	private final UserMapper userMapper;

	@GetMapping("/users")
	public ResponseEntity<List<UserDTO>> selectUserList(){
		return ResponseEntity.ok(userMapper.selectUserList());
	}

}
