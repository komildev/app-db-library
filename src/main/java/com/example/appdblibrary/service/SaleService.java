package com.example.appdblibrary.service;

import com.example.appdblibrary.payload.ApiResult;
import com.example.appdblibrary.payload.SaleAddDTO;
import com.example.appdblibrary.payload.SaleInfoDTO;

import java.util.List;

public interface SaleService {
    ApiResult<List<SaleInfoDTO>> getAll(int page, int size);
    ApiResult<SaleInfoDTO> getOne(Long id);

    ApiResult<SaleInfoDTO> add(SaleAddDTO saleAddDTO);

    ApiResult<SaleInfoDTO> update(SaleAddDTO saleUpdateDTO, Long id);
    ApiResult<?> delete(Long id);
}
