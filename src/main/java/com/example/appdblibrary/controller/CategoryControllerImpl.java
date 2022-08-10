package com.example.appdblibrary.controller;

import com.example.appdblibrary.payload.CategoryUpdateDTO;
import com.example.appdblibrary.service.CategoryService;
import com.example.appdblibrary.payload.ApiResult;
import com.example.appdblibrary.payload.CategoryAddDTO;
import com.example.appdblibrary.payload.CategoryInfoDTO;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryControllerImpl implements CategoryController{

    private final CategoryService categoryService;

    public CategoryControllerImpl(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @Override
    public ApiResult<List<CategoryInfoDTO>> getAll(int page, int size) {
        return categoryService.getAll(page, size);
    }

    @Override
    public ApiResult<CategoryInfoDTO> getOne(Long id) {
        return categoryService.getOne(id);
    }

    @Override
    public ApiResult<CategoryInfoDTO> add(CategoryAddDTO categoryAddDTO) {
        return categoryService.add(categoryAddDTO);
    }

    @Override
    public ApiResult<CategoryInfoDTO> update(CategoryUpdateDTO categoryUpdateDTO,Long id) {
        return categoryService.update(categoryUpdateDTO,id);
    }

    @Override
    public ApiResult<?> delete(Long id) {
        return categoryService.delete(id);
    }
}
