package wojtekkorys.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import wojtekkorys.springframework.domain.Category;
import wojtekkorys.springframework.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}