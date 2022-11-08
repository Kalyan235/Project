package com.create.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.create.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
