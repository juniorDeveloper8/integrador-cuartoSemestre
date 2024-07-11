package com.citasMedicas.Repository;

import com.citasMedicas.Entities.Distrito;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistritoRepository extends CrudRepository<Distrito, Integer> {
}
