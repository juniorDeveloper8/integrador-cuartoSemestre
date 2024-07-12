package com.citasMedicas.Services;

import com.citasMedicas.Entities.Historia;

import java.util.List;
import java.util.Optional;

public interface IHistoraService {

    List<Historia> findByActivoTrue();

    Optional<Historia> findById(Integer id);

    void save(Historia historia);
}
