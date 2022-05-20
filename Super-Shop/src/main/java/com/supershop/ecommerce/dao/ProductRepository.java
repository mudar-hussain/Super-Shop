package com.supershop.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.supershop.ecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
