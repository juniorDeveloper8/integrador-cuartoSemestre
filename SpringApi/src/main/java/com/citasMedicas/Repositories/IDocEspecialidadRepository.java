package com.citasMedicas.Repositories;

import com.citasMedicas.Entities.DocEspecialidad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDocEspecialidadRepository extends CrudRepository<DocEspecialidad, Integer> {
}
