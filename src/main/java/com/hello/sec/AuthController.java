/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hello.sec;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
//@RequestMapping(value = "/api/v1/auth")
@CrossOrigin(origins = "http://localhost:4200")
public class AuthController {
	Logger log = LoggerFactory.getLogger(AuthController.class);
	@Autowired
	private TokenUtiles tokenUtils;

	@Autowired
	private UserService userService;

	@Autowired
	private AuthenticationManager authenticationManager;
        
        	@Bean
	        public PasswordEncoder getPasswordEncoder() {
                
		return NoOpPasswordEncoder.getInstance();
	}

	     //@PostMapping(value = { "", "/login" })

        	//@PostMapping(value = {"/authenticate" })
               //public JWTResponse singIn(@RequestBody String username , @RequestBody String password) throws Exception {
                @PostMapping("/authenticate")
		public JWTResponse singIn(@RequestBody JwtTokenRequest authenticationRequest) throws Exception {
		log.info("authentication >> ");
		Authentication authentication = null;
//		try {
			authentication = authenticationManager
					.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(),authenticationRequest.getPassword() ));

//		} catch (DisabledException dis) {
//			return new JWTResponse(null, null, null, "USER_DISABLED");
//		} catch (BadCredentialsException e) {
//			return new JWTResponse(null, null, null, "INVALID_CREDENTIALS");
//			}

		log.info("authentication >> " + authentication.isAuthenticated());
		if (authentication.isAuthenticated()) {
			log.info("authentication >> " + authentication.isAuthenticated());
			SecurityContextHolder.getContext().setAuthentication(authentication);

			UserDetails userDetails = userService.loadUserByUsername(authenticationRequest.getUsername());
			Optional<AppUser> user = userService.findByUserName(authenticationRequest.getUsername());
                        
			String token = tokenUtils.generateToken(userDetails);
                        
			return new JWTResponse(user.get().getId(), token, authenticationRequest.getUsername() , user.get().getRoles(), "SUCCESS");
		}

	// return new JWTResponse(null, null, null, "INVALID");
        	return null ;

	}
                
//                @PostMapping("/authenticatee")
//	public JWTResponse createAuthenticationToken(@RequestBody JwtTokenRequest authenticationRequest)
//			 {
//
//		authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());
//
//		final UserDetails userDetails = jwtInMemoryUserDetailsService
//				.loadUserByUsername(authenticationRequest.getUsername());
//
//		final String token = jwtTokenUtil.generateToken(userDetails);
//
//		return ResponseEntity.ok(new JwtTokenResponse(token));
//	}
	@GetMapping("/users")
	public List<AppUser> getAllUsers() {
		return userService.getAllUsers();
	}
    @GetMapping("/users/{idd}")
	
    public AppUser findByiId (@PathVariable int idd) {
   	return userService.findById(idd) ;
   	
    }
        @PostMapping("/addUser")
	public String addCity(@RequestBody AppUser newCity) {
                newCity.setPassword(getPasswordEncoder().encode(newCity.getPassword()));
		userService.addUser(newCity);
		return "user saved";
	}
        

}