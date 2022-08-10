package com.example.appdblibrary.controller;

import com.example.appdblibrary.payload.ApiResult;
import com.example.appdblibrary.service.FavouriteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FavouriteControllerImpl implements FavouriteController{

    private final FavouriteService favouriteService;

    @Override
    public ApiResult<?> add(Long id) {
        return null;
    }

    @Override
    public ApiResult<?> deleteOne(Long id) {
        return null;
    }
}
