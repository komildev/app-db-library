package com.example.appdblibrary.entity.order;

import com.example.appdblibrary.entity.enums.DiscountTypeEnum;
import com.example.appdblibrary.entity.template.Bonus;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "price_sale")
@Getter
@Setter
@ToString
@SQLDelete(sql = "update price_sale set deleted = true where id = ?")
@Where(clause = "deleted=false")
public class PriceSale extends Bonus {

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @ToString.Exclude
    private Sale sale;

    @Column(nullable = false)
    private Double price; // qanchadan o'tsa masalan 200000 dan o'tsa

    @Enumerated(EnumType.STRING)
    private DiscountTypeEnum discountTypeEnum;

    @Column(nullable = false)
    private Double saleAmount;

}
