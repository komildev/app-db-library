package com.example.appdblibrary.controller;

import com.example.appdblibrary.payload.ApiResult;
import com.example.appdblibrary.payload.RecommendedProductAddDTO;
import com.example.appdblibrary.payload.RecommendedProductInfoDTO;
import com.example.appdblibrary.utils.AppConstant;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping(AppConstant.RECOMMENDED_PRODUCT_CONTROLLER_PATH)
public interface RecommendedProductController {

    @GetMapping(AppConstant.VIEW_ONE + "/{id}")
    ApiResult<RecommendedProductInfoDTO> getOne(@PathVariable Long id);

    @GetMapping(AppConstant.VIEW + "/byCategory/{id}")
    ApiResult<List<RecommendedProductInfoDTO>> getByCategoryId(@PathVariable Long id);

    @GetMapping(AppConstant.VIEW)
    ApiResult<List<RecommendedProductInfoDTO>> getAll(@RequestParam(defaultValue = "0") int page,
                                           @RequestParam(defaultValue = "5") int size);

    @PostMapping(AppConstant.ADD)
    ApiResult<RecommendedProductInfoDTO> add(@RequestBody @Valid RecommendedProductAddDTO recommendedProductAddDTO);

    @DeleteMapping(AppConstant.DELETE + "/{id}")
    ApiResult<?> delete(@PathVariable Long id);


}
