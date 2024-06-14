package com.citasMedicas.Services;

import com.citasMedicas.Entities.Rol;

import java.util.List;
import java.util.Optional;

public interface IRolService {
    List<Rol> findAll();

    Optional<Rol> findById(Integer id);

    void save(Rol rol);

    void deleteById(Integer id);
}
