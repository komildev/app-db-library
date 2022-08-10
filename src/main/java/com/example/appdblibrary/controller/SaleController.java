package com.example.appdblibrary.controller;


import com.example.appdblibrary.payload.ApiResult;
import com.example.appdblibrary.payload.SaleAddDTO;
import com.example.appdblibrary.payload.SaleInfoDTO;
import com.example.appdblibrary.utils.AppConstant;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(AppConstant.SALE_CONTROLLER_PATH)
public interface SaleController {

    @GetMapping(AppConstant.VIEW)
    ApiResult<List<SaleInfoDTO>>getAll(@RequestParam(defaultValue = "0") int page,
                                       @RequestParam(defaultValue = "10") int size);


    @GetMapping(AppConstant.VIEW_ONE + "/{id}")
    ApiResult<SaleInfoDTO> getOne(@PathVariable Long id);

    @PostMapping(AppConstant.ADD)
    ApiResult<SaleInfoDTO> add(@RequestBody SaleAddDTO saleAddDTO);

    @RequestMapping(AppConstant.UPDATE)
    ApiResult<SaleInfoDTO> update(@RequestBody SaleAddDTO saleUpdateDTO,@PathVariable Long id);

    @RequestMapping(AppConstant.DELETE + "/{id}")
    ApiResult<?> delete(@PathVariable Long id);

}
