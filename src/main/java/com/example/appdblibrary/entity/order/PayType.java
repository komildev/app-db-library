package com.example.appdblibrary.entity.order;

import com.example.appdblibrary.entity.template.AbsLongEntity;
import lombok.*;
import com.example.appdblibrary.entity.enums.PayTypeEnum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "pay_type")
public class PayType extends AbsLongEntity {

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    private PayTypeEnum enumType;

}
