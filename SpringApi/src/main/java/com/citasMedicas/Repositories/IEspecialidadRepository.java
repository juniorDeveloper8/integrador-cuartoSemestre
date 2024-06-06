package com.citasMedicas.Repositories;

import com.citasMedicas.Entities.Especialdad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEspecialidadRepository extends CrudRepository<Especialdad, Integer> {
}
