package com.am.petshop.user.mapper;

import com.am.petshop.user.model.User;
import com.am.petshop.user.rest.UserDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class UserMapper {

	private final ModelMapper mapper;

	public UserMapper(ModelMapper mapper) {
		this.mapper = mapper;
	}

	public User convertUserDtoToUser (UserDto userDto){
		User user = mapper.map(userDto, User.class);
		user.setLocalDate(LocalDate.now());
		return user;
	}
}
