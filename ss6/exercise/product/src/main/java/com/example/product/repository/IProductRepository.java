package com.example.product.repository;


import com.example.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface IProductRepository  extends JpaRepository<Product,Integer> {
    @Modifying
    @Query(value = "update blog_spring set price = :price, amount=:amount, name=:name  where id = :id", nativeQuery = true)
    void update( @Param("price") double price, @Param("amount") double amount, @Param("name") String name,@Param("id")int id);


}
