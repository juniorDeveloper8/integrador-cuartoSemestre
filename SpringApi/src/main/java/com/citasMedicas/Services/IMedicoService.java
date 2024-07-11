package com.citasMedicas.Services;

import com.citasMedicas.Entities.Medico;

import java.util.List;
import java.util.Optional;

public interface IMedicoService {

    List<Medico> findAll();

    Optional<Medico> findById(Integer id);

    void save(Medico medico);

    void deleteById(Integer id);
}
