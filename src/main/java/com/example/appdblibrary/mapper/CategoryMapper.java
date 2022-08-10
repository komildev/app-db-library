package com.example.appdblibrary.mapper;

import com.example.appdblibrary.entity.product.Category;
import com.example.appdblibrary.payload.CategoryInfoDTO;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapper {

    public CategoryInfoDTO entityToInfoDTO(Category category) {
        return new CategoryInfoDTO(
                category.getUzName(),
                category.getDescription()
        );
    }

}
