package com.example.appdblibrary.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RecommendedProductInfoDTO {

    private Long categoryId;

    private Long productId;

}
