/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hello;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

//@Configuration
//@EnableWebSecurity

public class SecurityConfiggggg {
	//extends WebSecurityConfigurerAdapter{
}
	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http
//		.cors().and().csrf().disable()
//		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//		.and()
//		.authorizeRequests()
//		.antMatchers(HttpMethod.OPTIONS,"/**").permitAll()
//		.anyRequest().authenticated()
//		.and()
//		 .httpBasic();
//	}
////	 
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http
//		.csrf().disable()
//			.authorizeRequests()
//			.antMatchers(HttpMethod.OPTIONS,"/**").permitAll()
//				.anyRequest().authenticated()
//				.and()
//			     //.formLogin().and()
//			     .httpBasic();
//	}
//	
//}
