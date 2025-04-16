package com.javaproject.jobportal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.javaproject.jobportal.entity.Users;
import com.javaproject.jobportal.repository.UsersRepository;
import com.javaproject.jobportal.util.CustomUserDetails;

@Service
public class CustomUserDetailsService implements UserDetailsService{
	
	private final UsersRepository usersRepository;
	
	@Autowired
	public CustomUserDetailsService(UsersRepository usersRepository) {
		this.usersRepository = usersRepository;
	}



	@Override
	public UserDetails loadUserByUsername(String usename) throws UsernameNotFoundException{
		Users user = usersRepository.findByEmail(usename).orElseThrow(() -> new
			UsernameNotFoundException("Could Not Find User"));
		return new CustomUserDetails(user);
		
	}

}
