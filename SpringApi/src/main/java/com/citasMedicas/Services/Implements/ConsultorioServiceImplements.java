package com.citasMedicas.Services.Implements;

import com.citasMedicas.Entities.Consultorio;
import com.citasMedicas.Repositories.IConsultorioRepository;
import com.citasMedicas.Services.IConsultorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultorioServiceImplements implements IConsultorioService {

    @Autowired
    private IConsultorioRepository consultorioRepository;

    @Override
    public List<Consultorio> findAll() {
        return (List<Consultorio>) consultorioRepository.findAll();
    }

    @Override
    public Consultorio findById(Integer id) {
        return consultorioRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Consultorio consultorio) {
        consultorioRepository.save(consultorio);
    }

    @Override
    public void deleteById(Integer id) {
        consultorioRepository.deleteById(id);
    }
}
