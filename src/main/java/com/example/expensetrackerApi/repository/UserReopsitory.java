package com.example.expensetrackerApi.repository;

import com.example.expensetrackerApi.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReopsitory extends JpaRepository<User,Long> {
}
