package com.citasMedicas.Services;

import com.citasMedicas.Entities.DocEspecialidad;

import java.util.List;

public interface IDocEspecialidadService {

    List<DocEspecialidad> findAll();

    DocEspecialidad findById(Integer id);

    void save(DocEspecialidad docEspecialidad);

    void deleteById(Integer id);
}
