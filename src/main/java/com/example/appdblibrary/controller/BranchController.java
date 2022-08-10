package com.example.appdblibrary.controller;

import com.example.appdblibrary.payload.ApiResult;
import com.example.appdblibrary.payload.BranchAddDTO;
import com.example.appdblibrary.payload.BranchInfoDTO;
import com.example.appdblibrary.payload.BranchUpdateDTO;
import com.example.appdblibrary.utils.AppConstant;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping(AppConstant.BRANCH_CONTROLLER_PATH)
public interface BranchController {


    @GetMapping(AppConstant.VIEW)
    ApiResult<List<BranchInfoDTO>> getAll(@RequestParam(defaultValue = "0") int page,
                                          @RequestParam(defaultValue = "10") int size);

    @GetMapping(AppConstant.VIEW_ONE + "/{id}")
    ApiResult<BranchInfoDTO> getOne(@PathVariable Integer id);

    @PostMapping(AppConstant.ADD)
    ApiResult<BranchInfoDTO> add(@RequestBody @Valid BranchAddDTO branchAddDTO);

    @PutMapping(AppConstant.UPDATE + "/{id}")
    ApiResult<BranchInfoDTO> update(@RequestBody BranchUpdateDTO branchUpdateDTO, @PathVariable Integer id);

    @DeleteMapping(AppConstant.DELETE + "/{id}")
    ApiResult<?> delete(@PathVariable Integer id);

}

