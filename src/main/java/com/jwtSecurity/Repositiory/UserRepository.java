package com.jwtSecurity.Repositiory;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jwtSecurity.Entity.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	Optional<User> findByUsernameOrEmail(String username, String email);

}
