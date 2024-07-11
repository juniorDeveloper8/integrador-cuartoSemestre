package com.citasMedicas.Services;

import com.citasMedicas.Entities.Paciente;

import java.util.List;
import java.util.Optional;

public interface IPacienteService {

    List<Paciente> findAll();

    Optional<Paciente> findById(Integer id);

    void save(Paciente paciente);

    void deleteById(Integer id);
}
