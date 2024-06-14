package com.citasMedicas.Services;

import com.citasMedicas.Entities.Especialdad;

import java.util.List;

public interface IEspecialidadService {

    List<Especialdad> findAll();

    Especialdad findById(Integer id);

    void save(Especialdad especialdad);

    void deleteById(Integer id);
}
