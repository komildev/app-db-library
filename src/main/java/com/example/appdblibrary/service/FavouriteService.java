package com.example.appdblibrary.service;


import uz.pdp.fastfoodapplicationg5.payload.ApiResult;

public interface FavouriteService {

    ApiResult<?> add(Long id);

    ApiResult<?> delete(Long id);

}
