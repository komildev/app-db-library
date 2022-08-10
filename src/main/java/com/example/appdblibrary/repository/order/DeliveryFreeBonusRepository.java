package com.example.appdblibrary.repository.order;

import com.example.appdblibrary.entity.order.DeliveryFreeSale;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DeliveryFreeBonusRepository extends JpaRepository<DeliveryFreeSale, Long> {

}
