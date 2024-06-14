package com.citasMedicas.Services;

import com.citasMedicas.Entities.HistorialClinico;

import java.util.List;
import java.util.Optional;

public interface IHistorialClinicoService {

    List<HistorialClinico> findAll();

    Optional<HistorialClinico> findById(Integer id);

    void save(HistorialClinico historialClinico);

    void deleteById(Integer id);
}
