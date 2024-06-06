package com.citasMedicas.Repositories;

import com.citasMedicas.Entities.Consultorio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IConsultorioRepository extends CrudRepository<Consultorio, Integer> {
}
