package com.citasMedicas.Services;

import com.citasMedicas.Entities.Identificacion;

import java.util.List;
import java.util.Optional;

public interface IIdentificacionService {

    List<Identificacion> findAll();

   Optional<Identificacion> findById(Integer id);

    void save(Identificacion identificacion);

    void deleteById(Integer id);
}
