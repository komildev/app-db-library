package com.example.appdblibrary.service;

import com.example.appdblibrary.entity.product.Category;
import com.example.appdblibrary.payload.CategoryUpdateDTO;
import com.example.appdblibrary.payload.ApiResult;
import com.example.appdblibrary.payload.CategoryAddDTO;
import com.example.appdblibrary.payload.CategoryInfoDTO;

import java.util.List;

public interface CategoryService {

    ApiResult<List<CategoryInfoDTO>> getAll(int page, int size);

    ApiResult<CategoryInfoDTO> getOne(Long id);

    ApiResult<CategoryInfoDTO> add(CategoryAddDTO categoryAddDTO);

    ApiResult<CategoryInfoDTO> update(CategoryUpdateDTO categoryUpdateDTO, Long id);

    ApiResult<?> delete(Long id);

    Category getByIdOrElseThrow(Long id);


}
