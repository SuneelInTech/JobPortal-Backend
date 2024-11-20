package com.suneel.JobPortal_Backend.repo;


import com.suneel.JobPortal_Backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
            User findByUsername(String username);
}
