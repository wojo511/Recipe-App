package wojtekkorys.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import wojtekkorys.springframework.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
