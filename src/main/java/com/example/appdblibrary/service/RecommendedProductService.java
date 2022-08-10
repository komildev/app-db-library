package com.example.appdblibrary.service;

import com.example.appdblibrary.payload.ApiResult;
import com.example.appdblibrary.payload.RecommendedProductAddDTO;
import com.example.appdblibrary.payload.RecommendedProductInfoDTO;

import java.util.List;

public interface RecommendedProductService {

    ApiResult<RecommendedProductInfoDTO> getOne(Long id);

    ApiResult<List<RecommendedProductInfoDTO>> getByCategoryId(Long id);

    ApiResult<List<RecommendedProductInfoDTO>> getAll(int page,int size);

    ApiResult<RecommendedProductInfoDTO> add(RecommendedProductAddDTO recommendedProductAddDTO);

    ApiResult<?> delete(Long id);

}
