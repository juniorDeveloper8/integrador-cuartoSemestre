package com.citasMedicas.Services.Implements;

import com.citasMedicas.Entities.HistorialClinico;
import com.citasMedicas.Repositories.IHistorialClinicoRepository;
import com.citasMedicas.Services.IHistorialClinicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HistorialClinicoServiceImplements implements IHistorialClinicoService {

    @Autowired
    private IHistorialClinicoRepository historialClinicoRepository;

    @Override
    public List<HistorialClinico> findAll() {
        return (List<HistorialClinico>) historialClinicoRepository.findAll();
    }

    @Override
    public Optional<HistorialClinico> findById(Integer id) {
        return historialClinicoRepository.findById(id);
    }

    @Override
    public void save(HistorialClinico historialClinico) {
        historialClinicoRepository.save(historialClinico);
    }

    @Override
    public void deleteById(Integer id) {
        historialClinicoRepository.deleteById(id);
    }
}
