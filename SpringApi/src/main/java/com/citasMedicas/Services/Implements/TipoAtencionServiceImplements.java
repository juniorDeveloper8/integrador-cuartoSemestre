package com.citasMedicas.Services.Implements;

import com.citasMedicas.Entities.TipoAtencion;
import com.citasMedicas.Repositories.ITipoAtencionRepository;
import com.citasMedicas.Services.ITipoAtencionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoAtencionServiceImplements implements ITipoAtencionService {

    @Autowired
    private ITipoAtencionRepository tipoAtencionRepository;

    @Override
    public List<TipoAtencion> findAll() {
        return (List<TipoAtencion>) tipoAtencionRepository.findAll();
    }

    @Override
    public TipoAtencion findById(Integer id) {
        return tipoAtencionRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(TipoAtencion tipoAtencion) {
        tipoAtencionRepository.save(tipoAtencion);
    }

    @Override
    public void update(Integer id, TipoAtencion tipoAtencion) {
// toca agregar los dto primero
    }

    @Override
    public void deleteById(Integer id) {
        tipoAtencionRepository.deleteById(id);
    }
}
