package com.javaguides.springjpademo.repository;


import com.javaguides.springjpademo.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductRepositoryTest {

    @Autowired
    ProductRepository productRepo;

//    @Test
//    public void saveEntity()
//    {
//        Product product = new Product();
//        product.setName("Product1");
//        product.setPrice(BigDecimal.valueOf(1054.24));
//        product.setSku("1064");
//        product.setDescription("Product 1");
//
//        Product savedProduct = productRepo.save(product);
//        System.out.println(savedProduct);
//        System.out.println(savedProduct.getId());
//    }

//    @Test
//    public void updateEntity()
//    {
//        Long id = 1L;
//
//        Product product = productRepo.findById(id).get();
//
//        product.setDescription("Product_new_2");
//        product.setSku("1342U");
//
//        productRepo.save(product);
//    }

//    @Test
//    void saveAllMethod()
//    {
//        List<Product> listOfProducts = new ArrayList<Product>();
//
//        Product product1 = new Product();
//        product1.setName("product1");
//        product1.setPrice(BigDecimal.valueOf(997.24));
//        product1.setSku("1765U");
//        product1.setDescription("Product Vamshi2");
//
//        Product product2 = new Product();
//        product2.setName("product2");
//        product2.setPrice(BigDecimal.valueOf(1094.24));
//        product2.setSku("764U");
//        product2.setDescription("Product 2");
//
//        Product product3 = new Product();
//        product3.setName("product3");
//        product3.setPrice(BigDecimal.valueOf(4506.24));
//        product3.setSku("9769U");
//        product3.setDescription("Product 3");
//
//        listOfProducts.add(product1);
//        listOfProducts.add(product2);
//        listOfProducts.add(product3);
//
//        List<Product> savedList = productRepo.saveAll(listOfProducts);
//        savedList.forEach(product -> System.out.println(product.getId()));
//    }
    @Test
    void findAll()
    {
        List<Product> findAllEntities = productRepo.findAll();
        find;

    }

}