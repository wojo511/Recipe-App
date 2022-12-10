package wojtekkorys.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import wojtekkorys.springframework.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findByDescription(String description);

}
