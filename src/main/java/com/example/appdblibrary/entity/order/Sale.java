package com.example.appdblibrary.entity.order;

import com.example.appdblibrary.entity.enums.SaleTypeEnum;
import com.example.appdblibrary.entity.template.Bonus;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
@SQLDelete(sql = "update sale set deleted = true, active = false where id = ?")
@Where(clause = "deleted=false")
public class Sale extends Bonus {


    private String name;

    @Column(columnDefinition = "text")
    private String description;

    @Enumerated(EnumType.STRING)
    private SaleTypeEnum saleType;

    @Column(nullable = false)
    private Double amount;

}
