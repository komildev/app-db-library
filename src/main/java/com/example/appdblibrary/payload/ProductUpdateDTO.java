package com.example.appdblibrary.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.fastfoodapplicationg5.entity.product.Attachment;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductUpdateDTO {

    private String nameUZ;

    private String nameRu;

    private String description;

    private Long categoryId;

}
