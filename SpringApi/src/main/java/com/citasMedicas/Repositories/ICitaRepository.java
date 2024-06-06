package com.citasMedicas.Repositories;

import com.citasMedicas.Entities.Cita;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICitaRepository extends CrudRepository<Cita, Integer> {
}
