package com.example.appdblibrary.service;

import com.example.appdblibrary.payload.ApiResult;
import com.example.appdblibrary.payload.BranchAddDTO;
import com.example.appdblibrary.payload.BranchInfoDTO;
import com.example.appdblibrary.payload.BranchUpdateDTO;

import java.util.List;

public interface BranchService {


    ApiResult<List<BranchInfoDTO>> getAll(int page, int size);

    ApiResult<BranchInfoDTO> getOne(Integer id);

    ApiResult<BranchInfoDTO> add(BranchAddDTO branchAddDTO);

    ApiResult<BranchInfoDTO> update(BranchUpdateDTO branchUpdateDTO, Integer id);

    ApiResult<?> delete(Integer id);
}
