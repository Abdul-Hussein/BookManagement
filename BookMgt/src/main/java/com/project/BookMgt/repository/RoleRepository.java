package com.project.BookMgt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.BookMgt.model.ERole;
import com.project.BookMgt.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
Optional<Role> findByName(ERole name);
}
