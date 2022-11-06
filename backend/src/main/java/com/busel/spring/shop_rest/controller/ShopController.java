package com.busel.spring.shop_rest.controller;

import com.busel.spring.shop_rest.entity.Category;
import com.busel.spring.shop_rest.exception_handling.NoSuchCategoryException;
import com.busel.spring.shop_rest.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/shop")
public class ShopController {
    @Autowired
    private CategoryService categoryService;

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

}
