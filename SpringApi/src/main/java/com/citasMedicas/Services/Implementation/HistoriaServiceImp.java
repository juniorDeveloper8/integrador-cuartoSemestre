package com.citasMedicas.Services.Implementation;

import com.citasMedicas.Entities.Historia;
import com.citasMedicas.Repository.HistoriaRepository;
import com.citasMedicas.Services.IHistoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HistoriaServiceImp implements IHistoraService {

    @Autowired
    private HistoriaRepository historiaRepository;

    @Override
    public List<Historia> findByActivoTrue() {
        return (List<Historia>) historiaRepository.findByActivoTrue();
    }

    @Override
    public Optional<Historia> findById(Integer id) {
        return historiaRepository.findById(id);
    }

    @Override
    public void save(Historia historia) {
        historiaRepository.save(historia);
    }
}
