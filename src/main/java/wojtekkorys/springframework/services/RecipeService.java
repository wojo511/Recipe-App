package wojtekkorys.springframework.services;

import wojtekkorys.springframework.domain.Recipe;

import java.util.Set;


public interface RecipeService {

    Set<Recipe> getRecipes();
}