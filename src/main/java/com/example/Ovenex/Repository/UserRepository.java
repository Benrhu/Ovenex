package com.example.Ovenex.Repository;

import com.example.Ovenex.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
