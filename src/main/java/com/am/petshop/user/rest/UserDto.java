package com.am.petshop.user.rest;


import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
	private Long user_id;
	private String firstname;
	private String lastname;
	private String username;
	private String email;
	private String password;
	private String phone;
}
