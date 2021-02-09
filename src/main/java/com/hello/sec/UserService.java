/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hello.sec;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
         
	@Autowired
	private UserRepository userRepository;
            
//	@Bean
//	public PasswordEncoder getPasswordEncoder() {
//                
//		return NoOpPasswordEncoder.getInstance();
//	}

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		Optional<AppUser> user = userRepository.findByUserName(userName);

		user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + userName));
                
		return user.map(MyUserDetails::new).get();
	}
          
	public void addUser(AppUser user) {
	    	//user.setPassword(getPasswordEncoder().encode(user.getPassword()));
		userRepository.save(user);
	}
//            public void addCity(City newCity) {
//    	      cityRepo.save(newCity); 
//              }
           
	public List<AppUser> getAllUsers() {

		return userRepository.findAll();
	}
         
	public Optional<AppUser> findByUserName(String userName) {

		return userRepository.findByUserName(userName);
	}
       public AppUser findById (long idd) {
    	
        return userRepository.findById(idd).orElse(null);
     }
}