package com.example.springAPIs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springAPIs.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
