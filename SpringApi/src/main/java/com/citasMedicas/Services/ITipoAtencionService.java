package com.citasMedicas.Services;

import com.citasMedicas.Entities.TipoAtencion;

import java.util.List;

public interface ITipoAtencionService {

    List<TipoAtencion> findAll();

    TipoAtencion findById(Integer id);

    void save(TipoAtencion tipoAtencion);

    void deleteById(Integer id);
}
