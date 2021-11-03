package com.vaya.jwtauth.model;

public class JwtResponse {
	
	public String jwtToken;

	public JwtResponse(String token) {
		// TODO Auto-generated constructor stub
		this.jwtToken = token;
	}
	

	public String getJwtToken() {
		return jwtToken;
	}

	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}
	
	

}
