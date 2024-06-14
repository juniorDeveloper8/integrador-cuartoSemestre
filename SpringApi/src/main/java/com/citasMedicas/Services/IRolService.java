package com.citasMedicas.Services;

import com.citasMedicas.Entities.Rol;

import java.util.List;

public interface IRolService {
    List<Rol> findAll();

    Rol findById(Integer id);

    void save(Rol rol);

    void deleteById(Integer id);
}
