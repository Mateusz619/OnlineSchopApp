package com.onlineshoppingsystem.project.repository;

import com.onlineshoppingsystem.project.data.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
