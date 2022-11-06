package com.busel.spring.shop_rest.service;

import com.busel.spring.shop_rest.entity.Category;
import java.util.List;

public interface CategoryService {
    public List<Category> getAllCategories();

    public void saveCategory(Category category);

    public Category getCategory(int id);

    public void deleteCategory(int id);
}
