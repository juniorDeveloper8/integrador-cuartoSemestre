package com.citasMedicas.Services.Implements;

import com.citasMedicas.Entities.Identificacion;
import com.citasMedicas.Repositories.IIdentificacionRepository;
import com.citasMedicas.Services.IIdentificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IdentficacionServiceImplements implements IIdentificacionService {

    @Autowired
    private IIdentificacionRepository identificacionRepository;

    @Override
    public List<Identificacion> findAll() {
        return (List<Identificacion>) identificacionRepository.findAll();
    }

    @Override
    public Optional<Identificacion> findById(Integer id) {
        return identificacionRepository.findById(id);
    }

    @Override
    public void save(Identificacion identificacion) {
        identificacionRepository.save(identificacion);// toca agregar los algorimos de validacion de celuda, ruc y pasaporte
    }

    @Override
    public void deleteById(Integer id) {
        identificacionRepository.deleteById(id);
    }
}
