package com.example.spring5recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.spring5recipeapp.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long>{

}
