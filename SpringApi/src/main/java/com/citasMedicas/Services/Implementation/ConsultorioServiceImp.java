package com.citasMedicas.Services.Implementation;

import com.citasMedicas.Entities.Consultorio;
import com.citasMedicas.Repository.ConsultorioRepository;
import com.citasMedicas.Services.IConsultorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultorioServiceImp implements IConsultorioService {

    @Autowired
    private ConsultorioRepository consultorioRepository;

    @Override
    public List<Consultorio> findAll() {
        return (List<Consultorio>) consultorioRepository.findAll();
    }

    @Override
    public Optional<Consultorio> findById(Integer id) {
        return consultorioRepository.findById(id);
    }

    @Override
    public void save(Consultorio consultorio) {
        consultorioRepository.save(consultorio);
    }
}
