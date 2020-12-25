package com.application.mynotes.repositories;

import com.application.mynotes.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

	Role findByRole(final String role);

}
