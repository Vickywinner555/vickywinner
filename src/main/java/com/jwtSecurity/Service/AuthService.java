package com.jwtSecurity.Service;

import com.jwtSecurity.Dto.LoginDto;

public interface AuthService {
	
	String login(LoginDto loginDto);
}
