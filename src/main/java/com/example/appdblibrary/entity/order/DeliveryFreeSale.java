package com.example.appdblibrary.entity.order;

import com.example.appdblibrary.entity.template.Bonus;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "delivery_sale")
@SQLDelete(sql = "update delivery_sale set deleted = true where id = ?")
@Where(clause = "deleted=false")
public class DeliveryFreeSale extends Bonus {

    private Double price;  // necha puldan otsa

}
