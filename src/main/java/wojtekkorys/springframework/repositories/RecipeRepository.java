package wojtekkorys.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import wojtekkorys.springframework.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
