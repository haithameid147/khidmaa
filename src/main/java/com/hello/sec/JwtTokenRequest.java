/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hello.sec;

import java.io.Serializable;

public class JwtTokenRequest implements Serializable {

	//private static final long serialVersionUID = -5616176897013108345L;

	private String username;
	private String password;
	
//	{
//	    "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpbjI4bWludXRlcyIsImV4cCI6MTU5NjA2ODkzNSwiaWF0IjoxNTk1NDY0MTM1fQ.Bg3dFLKJsU2laTfq93XSuJ9boW2_BfBLGNWs7TtkH0Objs2pkJnhbh6DBsfLbwqWa6xr6d5j4_gC0yqfWfmT7w"
//	}
	
//	{
//	    "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpbjI4bWludXRlcyIsImV4cCI6MTU5NjA3MDIwMiwiaWF0IjoxNTk1NDY1NDAyfQ.OXROpYi1qyFeq7LYUTVPNJb7HLpwwuVRC8qoZRWP2JCnAfNQPDfr8p7SU_h1tMUtc1zoCyhbLa9DPQadEzARTA"
//	}
	// Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpbjI4bWludXRlcyIsImV4cCI6MTU5NjA3MDIwMiwiaWF0IjoxNTk1NDY1NDAyfQ.OXROpYi1qyFeq7LYUTVPNJb7HLpwwuVRC8qoZRWP2JCnAfNQPDfr8p7SU_h1tMUtc1zoCyhbLa9DPQadEzARTA

	public JwtTokenRequest() {
		super();
	}

	public JwtTokenRequest(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}