package com.example.Ovenex.Repository;

import com.example.Ovenex.Entities.UserData;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@EntityScan(basePackageClasses = UserData.class)
@Repository
public interface UserDataRepository extends JpaRepository<UserData, Long> {
}
