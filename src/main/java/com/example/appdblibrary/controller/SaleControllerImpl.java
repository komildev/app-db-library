package com.example.appdblibrary.controller;

import com.example.appdblibrary.payload.ApiResult;
import com.example.appdblibrary.payload.SaleAddDTO;
import com.example.appdblibrary.payload.SaleInfoDTO;
import com.example.appdblibrary.service.SaleService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SaleControllerImpl implements SaleController {

    private final SaleService saleService;

    public SaleControllerImpl(SaleService saleService) {
        this.saleService = saleService;
    }

    @Override
    public ApiResult<List<SaleInfoDTO>> getAll(int page, int size) {
        return saleService.getAll(page, size);
    }

    @Override
    public ApiResult<SaleInfoDTO> getOne(Long id) {
        return saleService.getOne(id);
    }

    @Override
    public ApiResult<SaleInfoDTO> add(SaleAddDTO saleAddDTO) {
        return saleService.add(saleAddDTO);
    }

    @Override
    public ApiResult<SaleInfoDTO> update(SaleAddDTO saleUpdateDTO, Long id) {
        return saleService.update(saleUpdateDTO, id);
    }

    @Override
    public ApiResult<?> delete(Long id) {
        return saleService.delete(id);
    }
}
