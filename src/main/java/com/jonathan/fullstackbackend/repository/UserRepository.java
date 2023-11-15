package com.jonathan.fullstackbackend.repository;

import com.jonathan.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
