package com.citasMedicas.Repositories;

import com.citasMedicas.Entities.HistorialClinico;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHistorialClinicoRepository extends CrudRepository<HistorialClinico, Integer> {
}
