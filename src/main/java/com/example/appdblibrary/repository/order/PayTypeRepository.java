package com.example.appdblibrary.repository.order;

import com.example.appdblibrary.entity.enums.PayTypeEnum;
import com.example.appdblibrary.entity.order.PayType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface PayTypeRepository extends JpaRepository<PayType, Long> {


    List<PayType> findAllByPayType(PayTypeEnum payType);
}
