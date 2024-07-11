package com.citasMedicas.Services;

import com.citasMedicas.Entities.TipoDni;

import java.util.List;
import java.util.Optional;

public interface ITipoDniService {

    List<TipoDni> findAll();

    Optional<TipoDni> findById(Integer id);

    void save(TipoDni tipoDni);

    void deleteById(Integer id);
}
