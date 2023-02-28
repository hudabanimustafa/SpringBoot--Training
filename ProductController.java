package com.hudabanimustafa.pos.pos.controller;

import com.hudabanimustafa.pos.pos.dao.ProductDao;
import com.hudabanimustafa.pos.pos.entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/products")
@RestController
@CrossOrigin
public class ProductController {
    @Autowired
    private ProductDao productDao;


    @PostMapping("/update-product")
    public ProductEntity addProduct(@RequestBody ProductEntity product) {
        return this.productDao.addProduct(product);
    }

    @PostMapping("/add-product")
    public ProductEntity updateProduct(@RequestBody ProductEntity product) {
        return this.productDao.updateProduct(product);
    }




    @GetMapping("/delete-product")
    public String deleteProduct(@RequestParam Integer productId) {
        this.productDao.deleteProduct(productId);
        return "success";
    }
    @GetMapping("/get-by-barcode")
    public ProductEntity getProductByBarcode(@RequestParam String barcode){
   return   this.productDao.getProductByBarcode(barcode);
    }


    @GetMapping("/get-by-Id")
    public ProductEntity getProductById(@RequestParam int productId){
        return this.productDao.getProductById(productId);

    }

    @GetMapping("/get-all-products")
    public List<ProductEntity> getAllProducts(){
        return this.productDao.getAllProducts();

    }

}