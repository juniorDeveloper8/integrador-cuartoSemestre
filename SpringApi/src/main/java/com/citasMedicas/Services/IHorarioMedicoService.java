package com.citasMedicas.Services;

import com.citasMedicas.Entities.HorarioMedico;

import java.util.List;
import java.util.Optional;

public interface IHorarioMedicoService {

    List<HorarioMedico> findByEstHorario(boolean estHorario);

    Optional<HorarioMedico> findById(Integer id);

    void save(HorarioMedico horarioMedico);

    void deleteById(Integer id);
}
