package com.citasMedicas.Services.Implementation;

import com.citasMedicas.Entities.Distrito;
import com.citasMedicas.Repository.DistritoRepository;
import com.citasMedicas.Services.IDistritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DistritoServiceImp implements IDistritoService {

    @Autowired
    private DistritoRepository distritoRepository;

    @Override
    public List<Distrito> findAll() {
        return (List<Distrito>) distritoRepository.findAll();
    }

    @Override
    public Optional<Distrito> findById(Integer id) {
        return distritoRepository.findById(id);
    }

    @Override
    public void save(Distrito distrito) {

        distritoRepository.save(distrito);
    }
}
