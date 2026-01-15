package com.gustavo.auth_api.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavo.auth_api.domain.product.Product;
public interface ProductRepository extends JpaRepository <Product, String> {
}
