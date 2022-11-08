package com.create.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.create.entity.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{

}
