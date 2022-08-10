package com.example.appdblibrary.repository.user;

import com.example.appdblibrary.entity.users.District;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DistrictRepository extends JpaRepository<District, Long> {

    boolean existsByName(String name);
    boolean existsByNameAndIdNot(String name, UUID id);


    
}
