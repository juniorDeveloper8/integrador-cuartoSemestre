package com.citasMedicas.Services;

import com.citasMedicas.Entities.DocEspecialidad;

import java.util.List;
import java.util.Optional;

public interface IDocEspecialidadService {

    List<DocEspecialidad> findAll();

   Optional<DocEspecialidad> findById(Integer id);

    void save(DocEspecialidad docEspecialidad);

    void deleteById(Integer id);
}
