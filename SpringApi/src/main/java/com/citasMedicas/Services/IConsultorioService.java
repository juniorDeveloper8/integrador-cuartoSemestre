package com.citasMedicas.Services;

import com.citasMedicas.Entities.Consultorio;

import java.util.List;

public interface IConsultorioService {

    List<Consultorio> findAll();

    Consultorio findById(Integer id);

    void save(Consultorio consultorio);

    void deleteById(Integer id);
}
