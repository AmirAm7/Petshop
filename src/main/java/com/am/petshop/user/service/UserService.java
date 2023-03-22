package com.am.petshop.user.service;

import com.am.petshop.user.mapper.UserMapper;
import com.am.petshop.user.model.User;
import com.am.petshop.user.repository.UserRepository;
import com.am.petshop.user.rest.UserDto;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

	private final UserRepository userRepository;
	private final UserMapper userMapper;

	public UserService(UserRepository userRepository, UserMapper userMapper) {
		this.userRepository = userRepository;
		this.userMapper = userMapper;
	}

	@Override
	public long createUser(UserDto userDto) {
		User user = userRepository.save(userMapper.convertUserDtoToUser(userDto));
		return user.getUser_id();
	}
}
