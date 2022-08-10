package com.example.appdblibrary.controller;

import com.example.appdblibrary.payload.ApiResult;
import com.example.appdblibrary.payload.ProductAddDTO;
import com.example.appdblibrary.payload.ProductInfoDTO;
import com.example.appdblibrary.payload.ProductUpdateDTO;
import com.example.appdblibrary.utils.AppConstant;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(AppConstant.PRODUCT_CONTROLLER_PATH)
public interface ProductController {

    @GetMapping(AppConstant.VIEW_ONE + "/{id}")
    ApiResult<ProductInfoDTO> getOne(@PathVariable Long id);

    @GetMapping(AppConstant.VIEW)
    ApiResult<List<ProductInfoDTO>> getAll(@RequestParam(defaultValue = "0") int page,
                                           @RequestParam(defaultValue = "5") int size);

    @PostMapping(AppConstant.ADD)
    ApiResult<ProductInfoDTO> add(@RequestBody ProductAddDTO productAddDTO);

    @PutMapping(AppConstant.UPDATE + "/{id}")
    ApiResult<ProductInfoDTO> update(@RequestBody ProductUpdateDTO productUpdateDTO, @PathVariable Long id);

    @DeleteMapping(AppConstant.DELETE + "/{id}")
    ApiResult<?> delete(@PathVariable Long id);

}
