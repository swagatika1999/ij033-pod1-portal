package com.cognizant.portal.model;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserLoginCredential {

	@NotNull(message = "userId is required")
	private String userid;
	
	@NotNull(message = "Password is required")
	private String password;
}
