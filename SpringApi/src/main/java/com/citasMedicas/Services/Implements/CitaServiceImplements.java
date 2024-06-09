package com.citasMedicas.Services.Implements;

import com.citasMedicas.Entities.Cita;
import com.citasMedicas.Repositories.ICitaRepository;
import com.citasMedicas.Services.ICitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaServiceImplements implements ICitaService {

    @Autowired
    private ICitaRepository citaRepository;

    @Override
    public List<Cita> findAll() {
        return (List<Cita>) citaRepository.findAll();
    }

    @Override
    public Cita findById(Integer id) {
        return citaRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Cita cita) {
        citaRepository.save(cita);
    }

    @Override
    public void update(Integer id, Cita cita) {
// falta dto
    }

    @Override
    public void deleteById(Integer id) {
        citaRepository.deleteById(id);
    }
}
