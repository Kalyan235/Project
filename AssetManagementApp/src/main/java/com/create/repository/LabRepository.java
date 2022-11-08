package com.create.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.create.entity.Lab;


@Repository
public interface LabRepository extends JpaRepository<Lab, Long>{

}
