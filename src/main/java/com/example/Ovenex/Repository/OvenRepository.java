package com.example.Ovenex.Repository;

import com.example.Ovenex.Entities.Oven;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OvenRepository extends JpaRepository<Oven,Long> {

}
