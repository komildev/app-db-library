package com.example.appdblibrary.service;

import com.example.appdblibrary.entity.product.Product;
import com.example.appdblibrary.payload.ApiResult;
import com.example.appdblibrary.payload.ProductAddDTO;
import com.example.appdblibrary.payload.ProductInfoDTO;
import com.example.appdblibrary.payload.ProductUpdateDTO;

import java.util.List;

public interface ProductService {

    ApiResult<List<ProductInfoDTO>> getAll(int page, int size);

    ApiResult<ProductInfoDTO> getOne(Long id);

    ApiResult<ProductInfoDTO> add(ProductAddDTO productAddDTO);

    ApiResult<ProductInfoDTO> update(ProductUpdateDTO productUpdateDTO, Long id);

    ApiResult<?> delete(Long id);

    Product getByIdOrElseThrow(Long id);

}
