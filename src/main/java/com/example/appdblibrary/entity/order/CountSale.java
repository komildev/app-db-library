package com.example.appdblibrary.entity.order;

import com.example.appdblibrary.entity.product.Product;
import com.example.appdblibrary.entity.template.Bonus;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "count_sale")
@SQLDelete(sql = "update count_sale set deleted = true where id = ?")
@Where(clause = "deleted=false")
public class CountSale extends Bonus {

    @ManyToOne(fetch = FetchType.LAZY)
    private Product getProduct;           // qaysi product dan

    private Integer getProductAmount;     // qancha olsa

    @ManyToOne(fetch = FetchType.LAZY)
    private Product giftProduct;      // nima qo'shib beramiz

    private Integer giftProductAmount;   // nechta qo'shib beramiz

}
