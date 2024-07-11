package com.citasMedicas.Services;

import com.citasMedicas.Entities.Cargo;

import java.util.List;
import java.util.Optional;

public interface ICargoService {

    List<Cargo> findAll(); //listamos todos los cargos

    Optional<Cargo> findById(Integer id);

    void save(Cargo cargo);
}
