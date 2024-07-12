package com.citasMedicas.Services;

import com.citasMedicas.Entities.Cita;

import java.util.List;
import java.util.Optional;

public interface ICitaService {

    List<Cita> findByActivoTrue();

    Optional<Cita> findById(Integer id);

    void save(Cita cita);

    void deleteById(Integer id);
}
