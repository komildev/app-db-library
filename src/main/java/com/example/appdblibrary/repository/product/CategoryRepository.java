package com.example.appdblibrary.repository.product;

import com.example.appdblibrary.entity.product.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {


    boolean existsByRuNameOrUzNameEquals(String nameRu, String nameUz);

    boolean existsByRuNameAndUzNameAndIdAndActiveTrue(String name, Long id);

    boolean existsByNameAndActiveTrue(String name);
}
