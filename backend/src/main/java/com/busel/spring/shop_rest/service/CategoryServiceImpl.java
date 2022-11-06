package com.busel.spring.shop_rest.service;

import com.busel.spring.shop_rest.dao.CategoryDAO;
import com.busel.spring.shop_rest.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryDAO categoryDAO;

    @Override
    @Transactional
    public List<Category> getAllCategories() {
        return categoryDAO.getAllCategories();
    }

    @Override
    @Transactional
    public void saveCategory(Category category) {
        categoryDAO.saveCategory(category);
    }

    @Override
    @Transactional
    public Category getCategory(int id) {
        return categoryDAO.getCategory(id);
    }

    @Override
    @Transactional
    public void deleteCategory(int id) {
        categoryDAO.deleteCategory(id);
    }
}
