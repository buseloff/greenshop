package com.busel.spring.shop_rest.controller;

import com.busel.spring.shop_rest.entity.Category;
import com.busel.spring.shop_rest.entity.Product;
import com.busel.spring.shop_rest.exception_handling.NoSuchCategoryException;
import com.busel.spring.shop_rest.exception_handling.NoSuchProductException;
import com.busel.spring.shop_rest.service.CategoryService;
import com.busel.spring.shop_rest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;





@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
@RequestMapping("/shop")
public class ShopController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ProductService productService;

    @GetMapping("/categories")
    public List<Category> showAllCategories() {
        List<Category> allCategories = categoryService.getAllCategories();
        return allCategories;
    }

    @GetMapping("/categories/{id}")
    public Category getCategory(@PathVariable int id) {
        Category category = categoryService.getCategory(id);
        if (category == null) {
            throw new NoSuchCategoryException("There is no category with ID = " + id + " in Database");
        }
        return category;
    }

    @PostMapping("/categories")
    public Category addNewCategory(@RequestBody Category category) {
        categoryService.saveCategory(category);
        return category;
    }

    @PutMapping("/categories")
    public Category updateCategory(@RequestBody Category category) {
        categoryService.saveCategory(category);
        return category;
    }

    @DeleteMapping("/categories/{id}")
    public String deleteCategory(@PathVariable int id) {
        Category category = categoryService.getCategory(id);
        if (category == null) {
            throw new NoSuchCategoryException("There is no category with ID = " + id + " in Database");
        }
        categoryService.deleteCategory(id);
        return "Category with ID = " + id + " was deleted";
    }

    @GetMapping("/products")
    public List<Product> showAllProducts() {
        List<Product> allProducts = productService.getAllProducts();
        return allProducts;
    }

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable int id) {
        Product product = productService.getProduct(id);
        if (product == null) {
            throw new NoSuchProductException("There is no product with ID = " + id + " in Database");
        }
        return product;
    }

    @PostMapping("/products")
    public Product addNewProduct(@RequestBody Product product) {
        productService.saveProduct(product);
        return product;
    }

    @PutMapping("/products")
    public Product updateProduct(@RequestBody Product product) {
        productService.saveProduct(product);
        return product;
    }

    @DeleteMapping("/products/{id}")
    public String deleteProduct(@PathVariable int id) {
        Product product = productService.getProduct(id);
        if (product == null) {
            throw new NoSuchProductException("There is no product with ID = " + id + " in Database");
        }
        productService.deleteProduct(id);
        return "Product with ID = " + id + " was deleted";
    }

}
