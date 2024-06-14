package com.citasMedicas.Services;

import com.citasMedicas.Entities.Identificacion;

import java.util.List;

public interface IIdentificacionService {

    List<Identificacion> findAll();

    Identificacion findById(Integer id);

    void save(Identificacion identificacion);

    void deleteById(Integer id);
}
