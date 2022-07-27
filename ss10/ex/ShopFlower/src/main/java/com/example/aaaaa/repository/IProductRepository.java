package com.example.aaaaa.repository;

import com.example.aaaaa.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product,Long> {
}
