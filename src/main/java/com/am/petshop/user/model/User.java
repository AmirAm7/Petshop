package com.am.petshop.user.model;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long user_id;
	@Column(name = "firstname", length = 25, nullable = false)
	private String firstname;
	@Column(name = "lastname", length = 25, nullable = false)
	private String lastname;
	@Column(name = "username", length = 20, nullable = false)
	private String username;
	@Column(name = "email", length = 40, nullable = false)
	private String email;
	@Column(name = "password", length = 20, nullable = false)
	private String password;
	@Column(name = "phone", length = 12, nullable = false)
	private String phone;
	@Column(name = "creationDate")
	private LocalDate localDate;
}
