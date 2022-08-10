package com.example.appdblibrary.controller;

import com.example.appdblibrary.payload.ApiResult;
import com.example.appdblibrary.payload.CategoryAddDTO;
import com.example.appdblibrary.payload.CategoryInfoDTO;
import com.example.appdblibrary.payload.CategoryUpdateDTO;
import com.example.appdblibrary.utils.AppConstant;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static com.example.appdblibrary.utils.AppConstant.DELETE;

@RequestMapping(AppConstant.CATEGORY_CONTROLLER_PATH)
public interface CategoryController {


    @GetMapping(AppConstant.VIEW)
    ApiResult<List<CategoryInfoDTO>> getAll(@RequestParam(defaultValue = "0") int page,
                                            @RequestParam(defaultValue = "10") int size);

    @RequestMapping(AppConstant.VIEW_ONE + "/{id}")
    ApiResult<CategoryInfoDTO> getOne(@PathVariable Long id);

    @RequestMapping(AppConstant.ADD)
    ApiResult<CategoryInfoDTO> add(@RequestBody CategoryAddDTO categoryAddDTO);

    @RequestMapping(AppConstant.UPDATE)
    ApiResult<CategoryInfoDTO> update(@RequestBody CategoryUpdateDTO categoryUpdateDTO,
                                      @PathVariable Long id);

    @RequestMapping(AppConstant.DELETE + "/{id}")
    ApiResult<?> delete(@PathVariable Long id);

}
