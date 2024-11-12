package com.javaguides.springjpademo.repository;

import com.javaguides.springjpademo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
