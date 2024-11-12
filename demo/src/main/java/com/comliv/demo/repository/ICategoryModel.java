package com.comliv.demo.repository;

import java.util.ArrayList;

import com.comliv.demo.model.CategoryModel;

public interface ICategoryModel {

    public void save(CategoryModel category);
    public ArrayList<CategoryModel> findAll();
    public CategoryModel findById(long id);
    public void deleteById(long id);
    
}
