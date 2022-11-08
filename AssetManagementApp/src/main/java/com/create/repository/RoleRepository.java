package com.create.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.create.entity.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

}
