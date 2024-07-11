package com.citasMedicas.Repository;

import com.citasMedicas.Entities.Medico;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicoRepository extends CrudRepository<Medico, Integer> {

    List<Medico> findByActivoTrue();
}
