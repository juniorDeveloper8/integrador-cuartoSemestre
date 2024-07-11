package com.citasMedicas.Repository;

import com.citasMedicas.Entities.HorarioMedico;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HorarioMedicoRepository extends CrudRepository<HorarioMedico, Integer> {
    // toca rebisar este metodo
   List<HorarioMedico> findByEstHorario(boolean estHorario);
}
