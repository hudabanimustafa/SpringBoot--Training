package com.hudabanimustafa.pos.pos.repository;

import com.hudabanimustafa.pos.pos.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<ProductEntity, Integer> {

    ProductEntity findByBarcode(String barcode);
}