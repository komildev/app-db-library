package com.example.appdblibrary.entity.users;

import com.example.appdblibrary.entity.template.AbsLongEntity;
import lombok.*;
import com.example.appdblibrary.entity.enums.Permissions;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "roles")
public class Role extends AbsLongEntity {

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @ElementCollection
    private Set<Permissions> permissions;

}
