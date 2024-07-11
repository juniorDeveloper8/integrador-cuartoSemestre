package com.citasMedicas.Repository;

import com.citasMedicas.Entities.Consultorio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultorioRepository extends CrudRepository<Consultorio, Integer> {
}
