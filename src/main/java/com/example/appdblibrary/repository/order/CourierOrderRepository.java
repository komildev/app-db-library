package com.example.appdblibrary.repository.order;

import com.example.appdblibrary.entity.order.CourierOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CourierOrderRepository extends JpaRepository<CourierOrder, Long> {

}
