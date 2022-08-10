package com.example.appdblibrary.controller;

import com.example.appdblibrary.payload.ApiResult;
import com.example.appdblibrary.payload.RecommendedProductAddDTO;
import com.example.appdblibrary.payload.RecommendedProductInfoDTO;
import com.example.appdblibrary.service.RecommendedProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RecommendedProductControllerImpl implements RecommendedProductController {

    private final RecommendedProductService recommendedProductService;

    @Override
    public ApiResult<RecommendedProductInfoDTO> getOne(Long id) {
        return recommendedProductService.getOne(id);
    }

    @Override
    public ApiResult<List<RecommendedProductInfoDTO>> getByCategoryId(Long id) {
        return recommendedProductService.getByCategoryId(id);
    }

    @Override
    public ApiResult<List<RecommendedProductInfoDTO>> getAll(int page, int size) {
        return recommendedProductService.getAll(page, size);
    }

    @Override
    public ApiResult<RecommendedProductInfoDTO> add(RecommendedProductAddDTO recommendedProductAddDTO) {
        return recommendedProductService.add(recommendedProductAddDTO);
    }

    @Override
    public ApiResult<?> delete(Long id) {
        return recommendedProductService.delete(id);
    }
}
