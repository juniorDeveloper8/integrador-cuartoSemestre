package com.citasMedicas.Services.Implements;

import com.citasMedicas.Entities.HistorialClinico;
import com.citasMedicas.Repositories.IHistorialClinicoRepository;
import com.citasMedicas.Services.IHistorialClinicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistorialClinicoServiceImplements implements IHistorialClinicoService {

    @Autowired
    private IHistorialClinicoRepository historialClinicoRepository;

    @Override
    public List<HistorialClinico> findAll() {
        return (List<HistorialClinico>) historialClinicoRepository.findAll();
    }

    @Override
    public HistorialClinico findById(Integer id) {
        return historialClinicoRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(HistorialClinico historialClinico) {
        historialClinicoRepository.save(historialClinico);
    }

    @Override
    public void update(Integer id, HistorialClinico historialClinico) {
        //falta dto
    }

    @Override
    public void deleteById(Integer id) {
        historialClinicoRepository.deleteById(id);
    }
}
