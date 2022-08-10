package com.example.appdblibrary.repository.order;

import com.example.appdblibrary.entity.order.DeliveryPrice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface DeliveryPriceRepository extends JpaRepository<DeliveryPrice, Long> {



    Optional<DeliveryPrice> findByBranchId(Long branch_id);
}
