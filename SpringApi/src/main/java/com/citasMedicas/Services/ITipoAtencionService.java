package com.citasMedicas.Services;

import com.citasMedicas.Entities.TipoAtencion;

import java.util.List;
import java.util.Optional;

public interface ITipoAtencionService {

    List<TipoAtencion> findAll();

    Optional<TipoAtencion> findById(Integer id);

    void save(TipoAtencion tipoAtencion);

    void deleteById(Integer id);
}
