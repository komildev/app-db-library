package com.example.appdblibrary.payload;

import com.example.appdblibrary.entity.enums.SaleTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SaleAddDTO {

    @NotEmpty(message = "{SALE_NAME_NOT_EMPTY}")
    private String name;

    private String description;

    @NotNull(message = "{SALE_TYPE_NOT_NULL}")
    private SaleTypeEnum type;


    @NotNull(message = "{SALE_AMOUNT_NOT_NULL}")
    private Double amount;

}
