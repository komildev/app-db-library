package com.example.appdblibrary.entity.order;

import com.example.appdblibrary.entity.enums.BasketType;
import com.example.appdblibrary.entity.template.AbsLongEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.example.appdblibrary.entity.users.User;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "basket")
public class Basket extends AbsLongEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private User user;

    @Column(name = "user_id")
    private Long userId;

    @OneToMany
    private List<Details> detailsList;

    private BasketType basketType;

    private Double finalPrice;

}
