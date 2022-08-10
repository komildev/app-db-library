package com.example.appdblibrary.repository;

import com.example.appdblibrary.entity.order.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BranchRepository extends JpaRepository<Branch,Integer> {

    Optional<Branch> findByAddress(String address);
}
