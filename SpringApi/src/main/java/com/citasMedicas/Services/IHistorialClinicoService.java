package com.citasMedicas.Services;

import com.citasMedicas.Entities.HistorialClinico;

import java.util.List;

public interface IHistorialClinicoService {

    List<HistorialClinico> findAll();

    HistorialClinico findById(Integer id);

    void save(HistorialClinico historialClinico);

    void deleteById(Integer id);
}
