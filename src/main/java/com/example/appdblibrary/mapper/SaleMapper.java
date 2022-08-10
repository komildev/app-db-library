package com.example.appdblibrary.mapper;


import com.example.appdblibrary.entity.order.Sale;
import com.example.appdblibrary.payload.SaleInfoDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SaleMapper {
    SaleInfoDTO entityToInfoDTO(Sale sale);

    SaleInfoDTO saleResToDoDTO(Sale sale);
}
