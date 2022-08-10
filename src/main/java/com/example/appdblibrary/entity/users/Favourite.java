package com.example.appdblibrary.entity.users;

import com.example.appdblibrary.entity.product.Product;
import com.example.appdblibrary.entity.template.AbsLongEntity;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity(name = "favourite")
public class Favourite extends AbsLongEntity {

    @OneToOne(fetch = FetchType.LAZY)
    private User user;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Product> favouriteProduct;

}
