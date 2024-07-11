package com.citasMedicas.Services;

import com.citasMedicas.Entities.Consultorio;

import java.util.List;
import java.util.Optional;

public interface IConsultorioService {

    List<Consultorio> findAll();

    Optional<Consultorio> findById(Integer id);

    void save(Consultorio consultorio);
}
