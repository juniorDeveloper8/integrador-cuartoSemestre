package com.citasMedicas.Services;

import com.citasMedicas.Entities.Especialdad;

import java.util.List;
import java.util.Optional;

public interface IEspecialidadService {

    List<Especialdad> findAll();

    Optional<Especialdad> findById(Integer id);

    void save(Especialdad especialdad);

    void deleteById(Integer id);
}
