package com.example.myspringproject.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myspringproject.model.User;



public interface UserRepository extends JpaRepository<User, Long> {
        
}
