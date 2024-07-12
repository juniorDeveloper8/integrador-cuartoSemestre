package com.citasMedicas.Services;

import com.citasMedicas.Entities.Empleado;

import java.util.List;
import java.util.Optional;

public interface IEmpleadoService {

    List<Empleado> findByActivoTrue();

    Optional<Empleado> findById(Integer id);

    void save(Empleado empleado);

    void deleteById(Integer id);
}
