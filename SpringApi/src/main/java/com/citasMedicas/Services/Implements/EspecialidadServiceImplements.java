package com.citasMedicas.Services.Implements;

import com.citasMedicas.Entities.Especialdad;
import com.citasMedicas.Repositories.IEspecialidadRepository;
import com.citasMedicas.Services.IEspecialidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EspecialidadServiceImplements implements IEspecialidadService {

    @Autowired
    private IEspecialidadRepository especialidadRepository;

    @Override
    public List<Especialdad> findAll() {
        return (List<Especialdad>) especialidadRepository.findAll();
    }

    @Override
    public Optional<Especialdad> findById(Integer id) {
        return especialidadRepository.findById(id);
    }

    @Override
    public void save(Especialdad especialdad) {
        especialidadRepository.save(especialdad);
    }

    @Override
    public void deleteById(Integer id) {
        especialidadRepository.deleteById(id);
    }
}
