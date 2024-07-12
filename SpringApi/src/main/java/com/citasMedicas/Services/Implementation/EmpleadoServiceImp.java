package com.citasMedicas.Services.Implementation;

import com.citasMedicas.Entities.Empleado;
import com.citasMedicas.Repository.EmpleadoRepository;
import com.citasMedicas.Services.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoServiceImp implements IEmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public List<Empleado> findByActivoTrue() {
        return (List<Empleado>) empleadoRepository.findByActivoTrue();
    }

    @Override
    public Optional<Empleado> findById(Integer id) {
        return empleadoRepository.findById(id);
    }

    @Override
    public void save(Empleado empleado) {

        empleadoRepository.save(empleado);
    }

    @Override
    public void deleteById(Integer id) {

        Optional<Empleado> empleadoOptional = empleadoRepository.findById(id);
        if (empleadoOptional.isPresent()) {

            Empleado empleado = empleadoOptional.get();

            empleado.desactivarEmpleado();
            empleadoRepository.save(empleado);
        }

    }
}
