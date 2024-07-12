package com.citasMedicas.Services.Implementation;

import com.citasMedicas.Entities.Especialidad;
import com.citasMedicas.Repository.EspecialidadRepository;
import com.citasMedicas.Services.IEspesialidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EspecialidadServiceImp implements IEspesialidadService {

    @Autowired
    private EspecialidadRepository especialidadRepository;

    @Override
    public List<Especialidad> findAll() {
        return (List<Especialidad>) especialidadRepository.findAll();
    }

    @Override
    public Optional<Especialidad> findById(Integer id) {
        return especialidadRepository.findById(id);
    }

    @Override
    public void save(Especialidad especialidad) {
        especialidadRepository.save(especialidad);
    }
}
