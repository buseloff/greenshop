package com.busel.spring.shop_rest.service;

import com.busel.spring.shop_rest.entity.Product;
import java.util.List;

public interface ProductService {
    public List<Product> getAllProducts();

    public void saveProduct(Product product);

    public Product getProduct(int id);

    public void deleteProduct(int id);
}
