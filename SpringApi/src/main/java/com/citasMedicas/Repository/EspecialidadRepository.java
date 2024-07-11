package com.citasMedicas.Repository;

import com.citasMedicas.Entities.Especialidad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecialidadRepository extends CrudRepository<Especialidad, Integer> {
}
