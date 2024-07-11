package com.citasMedicas.Services;

import com.citasMedicas.Entities.Especialidad;

import java.util.List;
import java.util.Optional;

public interface IEspesialidadService {

    List<Especialidad> findAll();

    Optional<Especialidad> findById(Integer id);

    void save(Especialidad especialidad);

}

