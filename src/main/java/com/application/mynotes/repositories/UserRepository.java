package com.application.mynotes.repositories;

import com.application.mynotes.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(final String email);

}
