package com.tcs.security.service;

import java.util.Optional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
 
import com.tcs.security.model.MyUserDetails;
import com.tcs.security.model.User;
import com.tcs.security.repo.UserRepository;
 
public class MyUserDetailsService implements UserDetailsService {
	@Autowired
	UserRepository repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<User> user=repo.findByUsername(username);
		user.orElseThrow(() -> (new UsernameNotFoundException("Not Found:"+username)));
		return user.map(MyUserDetails::new).get();
	}
 

}