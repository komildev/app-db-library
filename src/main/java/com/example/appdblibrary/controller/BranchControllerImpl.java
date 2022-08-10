package com.example.appdblibrary.controller;

import com.example.appdblibrary.payload.ApiResult;
import com.example.appdblibrary.payload.BranchAddDTO;
import com.example.appdblibrary.payload.BranchInfoDTO;
import com.example.appdblibrary.payload.BranchUpdateDTO;
import com.example.appdblibrary.service.BranchService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class BranchControllerImpl implements BranchController{

    private final BranchService branchService;

    public BranchControllerImpl(BranchService branchService) {
        this.branchService = branchService;
    }

    @Override
    public ApiResult<List<BranchInfoDTO>> getAll(int page, int size) {
        return branchService.getAll(page,size);
    }

    @Override
    public ApiResult<BranchInfoDTO> getOne(Integer id) {
        return branchService.getOne(id);
    }

    @Override
    public ApiResult<BranchInfoDTO> add(BranchAddDTO branchAddDTO) {
        return branchService.add(branchAddDTO);
    }

    @Override
    public ApiResult<BranchInfoDTO> update(BranchUpdateDTO branchUpdateDTO, Integer id) {
        return branchService.update(branchUpdateDTO, id);
    }

    @Override
    public ApiResult<?> delete(Integer id) {
        return branchService.delete(id);
    }
}
