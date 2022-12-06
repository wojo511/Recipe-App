package wojtekkorys.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import wojtekkorys.springframework.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
