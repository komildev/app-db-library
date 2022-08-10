package com.example.appdblibrary.repository.order;

import com.example.appdblibrary.entity.order.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SaleRepository extends JpaRepository<Sale, Long> {


    boolean existsByName(String name);
}
