package com.example.demo.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Player;
// passing entity and data type of id
public interface PlayerRepository extends JpaRepository<Player, Long> {

}
