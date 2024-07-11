package com.citasMedicas.Repository;

import com.citasMedicas.Entities.Cita;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CitaRepository extends CrudRepository<Cita, Integer> {
    List<Cita> findByActivoTrue();
}
