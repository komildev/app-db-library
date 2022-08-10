package com.example.appdblibrary.payload;

import com.example.appdblibrary.entity.enums.SaleTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SaleInfoDTO {

    private Long id;

    private String name;

    private SaleTypeEnum type;

    private Boolean active;

    private Double amount;
}
