package com.example.appdblibrary.entity.users;

import com.example.appdblibrary.entity.template.AbsLongEntity;
import lombok.*;
import com.example.appdblibrary.entity.enums.RegionEnum;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Region extends AbsLongEntity {

    @Enumerated(EnumType.STRING)
    private RegionEnum regionEnum;

}
