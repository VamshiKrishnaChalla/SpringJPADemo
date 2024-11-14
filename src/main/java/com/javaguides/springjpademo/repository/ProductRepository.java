package com.javaguides.springjpademo.repository;

import com.javaguides.springjpademo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    public List<Product> findByName(String name);
    public Optional<Product> findFirstByActive(boolean active);
    //public List<Product> findByIdOrName(Long id, String name);

}
