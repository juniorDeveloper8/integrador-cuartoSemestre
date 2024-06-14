package com.citasMedicas.Services.Implements;

import com.citasMedicas.Entities.Cita;
import com.citasMedicas.Repositories.ICitaRepository;
import com.citasMedicas.Services.ICitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CitaServiceImplements implements ICitaService {

    @Autowired
    private ICitaRepository citaRepository;

    @Override
    public List<Cita> findAll() {
        return (List<Cita>) citaRepository.findAll();
    }

    @Override
    public Optional<Cita> findById(Integer id) {
        return citaRepository.findById(id);
    }

    @Override
    public void save(Cita cita) {
        citaRepository.save(cita);
    }

    @Override
    public void deleteById(Integer id) {
        citaRepository.deleteById(id);
    }
}
