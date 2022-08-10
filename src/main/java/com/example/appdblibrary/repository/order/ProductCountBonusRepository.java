package com.example.appdblibrary.repository.order;

import com.example.appdblibrary.entity.order.CountSale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCountBonusRepository extends JpaRepository<CountSale, Long> {

}
