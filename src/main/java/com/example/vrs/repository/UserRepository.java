package com.example.vrs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.vrs.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}