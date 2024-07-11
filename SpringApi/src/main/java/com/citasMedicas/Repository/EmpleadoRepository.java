package com.citasMedicas.Repository;

import com.citasMedicas.Entities.Empleado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpleadoRepository extends CrudRepository<Empleado, Integer> {

    List<Empleado> findByActivoTrue();
}
