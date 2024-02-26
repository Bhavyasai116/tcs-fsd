package com.tcs.security.repo;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import com.tcs.security.model.User;
 
@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
	Optional<User> findByUsername(String userName);
	
 
}