package com.create.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.create.entity.Asset;

@Repository
public interface AssetRepository extends JpaRepository<Asset, Long>{

}
