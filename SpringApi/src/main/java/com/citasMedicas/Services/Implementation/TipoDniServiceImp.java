package com.citasMedicas.Services.Implementation;

import com.citasMedicas.Entities.TipoDni;
import com.citasMedicas.Repository.TipoDniRepository;
import com.citasMedicas.Services.ITipoDniService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoDniServiceImp implements ITipoDniService {

    @Autowired
    private TipoDniRepository tipoDniRepository;

    @Override
    public List<TipoDni> findAll() {
        return (List<TipoDni>) tipoDniRepository.findAll();
    }

    @Override
    public Optional<TipoDni> findById(Integer id) {
        return tipoDniRepository.findById(id);
    }

    @Override
    public void save(TipoDni tipoDni) {
        tipoDniRepository.save(tipoDni);
    }
}
