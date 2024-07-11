package com.citasMedicas.Services;

import com.citasMedicas.Entities.TipoSeguro;

import java.util.List;
import java.util.Optional;

public interface ITipoSeguroService {

    List<TipoSeguro> findAll();

    Optional<TipoSeguro> findById(Integer id);

    void save(TipoSeguro tipoSeguro);
}
