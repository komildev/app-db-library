package com.example.appdblibrary.entity.users;

import com.example.appdblibrary.entity.enums.LanguageEnum;
import com.example.appdblibrary.entity.order.CourierOrder;
import com.example.appdblibrary.entity.product.Attachment;
import com.example.appdblibrary.entity.template.AbsLongEntity;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "users")
@SQLDelete(sql = "update users set deleted = true where id = ?")
@Where(clause = "deleted=false")
public class User extends AbsLongEntity {

    @Column(nullable = false)
    private String firstname;

    private String lastname;

    @Column(nullable = false, unique = true)
    private String phoneNumber;

    @JoinColumn(name = "avatar_id", insertable = false, updatable = false)
    @OneToOne(fetch = FetchType.LAZY)
    private Attachment avatar;

    @Column(name = "avatar_id")
    private Long avatarId;

    @Enumerated(EnumType.STRING)
    private LanguageEnum language;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Address> defaultAddresses;

    @ManyToOne(fetch = FetchType.LAZY)
    private Role role;

    @OneToMany(mappedBy = "courier")
    private List<CourierOrder> orderList;

}
