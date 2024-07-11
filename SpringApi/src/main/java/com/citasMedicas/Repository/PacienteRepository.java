package com.citasMedicas.Repository;

import com.citasMedicas.Entities.Paciente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PacienteRepository extends CrudRepository<Paciente, Integer> {

    List<Paciente> findByActivoTrue();
}
