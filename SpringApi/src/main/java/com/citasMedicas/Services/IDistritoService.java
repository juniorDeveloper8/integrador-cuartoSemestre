package com.citasMedicas.Services;

import com.citasMedicas.Entities.Distrito;

import java.util.List;
import java.util.Optional;

public interface IDistritoService {

    List<Distrito> findAll();

    Optional<Distrito> findById(Integer id);

    void save(Distrito distrito);
}
