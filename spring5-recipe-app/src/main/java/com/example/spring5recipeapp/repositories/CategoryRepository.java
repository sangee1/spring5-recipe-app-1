package com.example.spring5recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.spring5recipeapp.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
