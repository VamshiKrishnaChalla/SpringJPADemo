package com.javaguides.springjpademo.repository;


import com.javaguides.springjpademo.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductRepositoryTest {

    @Autowired
    ProductRepository productRepo;

    @Test
    public void saveEntity()
    {
        Product product = new Product();
        product.setName("Product1");
        product.setPrice(BigDecimal.valueOf(1054.24));
        product.setSku("1064");
        product.setDescription("Product 1");

        Product savedProduct = productRepo.save(product);
        System.out.println(savedProduct);
        System.out.println(savedProduct.getId());
    }
}