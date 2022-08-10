package com.example.appdblibrary.repository.user;

import com.example.appdblibrary.entity.enums.RegionEnum;
import com.example.appdblibrary.entity.users.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface RegionRepository extends JpaRepository<Region, Long> {
    Optional<Region> findByName(RegionEnum name);

}
