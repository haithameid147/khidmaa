/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hello.sec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	private final String [] PUBLIC_ENDPOINTS = {
			
			"/api/v1/auth/**", "/v2/api-docs", 
                         "/employees",
                         "/authenticate",
                         "/addUser",
                         "/area",
                         "/employees/{cityId}/allarea",
                         "/city/{cityId}/foundation",

                                                  "/orders",
                         "/service/{servicesId}/orders",
                         "/city/{cityId}/oders",
                         "/addorders",

                         
                         
                         
                         "/area/{idd}",
                         "/service/{idd}",
                         "/allServices",
                         "/foundation",
                         "/employees/{servicesId}/foundation",
                         "/foundation/{idd}",
                         "/users/{idd}",
                         "/apppUserr/{appUserId}/foundation",
                         "/employees/{servicesId}/foundation",
			"/configuration/ui", "/swagger-resources", 
			"/configuration/security", "/swagger-ui.html",
			"/webjars/**","/swagger-resources/configuration/ui"
	};
	
	@Autowired
    UserDetailsService userDetailsService;
	

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService);
			}
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.cors().and().csrf().disable()
		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
		.and()
		.authorizeRequests()
        	.antMatchers(PUBLIC_ENDPOINTS).permitAll()
              //  .antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
		.anyRequest().authenticated()
		.and()
	.addFilterBefore(authFilter(), UsernamePasswordAuthenticationFilter.class);
	}
	
	
	@Bean
	protected AuthenticationManager authenticationManager() throws Exception {
		// TODO Auto-generated method stub
		return super.authenticationManager();
	}
	
	@Bean
	public AuthFilter authFilter () {
		
		return new AuthFilter() ;
	}

}