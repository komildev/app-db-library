package com.example.appdblibrary.repository.product;

import com.example.appdblibrary.entity.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
