package com.citasMedicas.Services;

import com.citasMedicas.Entities.Cita;

import java.util.List;

public interface ICitaService {

    List<Cita> findAll();

    Cita findById(Integer id);

    void save(Cita cita);

    void deleteById(Integer id);
}
