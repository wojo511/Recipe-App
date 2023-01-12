package wojtekkorys.springframework.services;

import wojtekkorys.springframework.commands.RecipeCommand;
import wojtekkorys.springframework.domain.Recipe;

import java.util.Set;


public interface RecipeService {

    Set<Recipe> getRecipes();
    Recipe findById(Long l);
    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
