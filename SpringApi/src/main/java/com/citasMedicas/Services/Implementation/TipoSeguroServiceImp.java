package com.citasMedicas.Services.Implementation;

import com.citasMedicas.Entities.TipoSeguro;
import com.citasMedicas.Repository.TipoSeguroRepository;
import com.citasMedicas.Services.ITipoSeguroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoSeguroServiceImp implements ITipoSeguroService {

    @Autowired
    private TipoSeguroRepository tipoSeguroRepository;

    @Override
    public List<TipoSeguro> findAll() {
        return (List<TipoSeguro>) tipoSeguroRepository.findAll();
    }

    @Override
    public Optional<TipoSeguro> findById(Integer id) {
        return tipoSeguroRepository.findById(id);
    }

    @Override
    public void save(TipoSeguro tipoSeguro) {
        tipoSeguroRepository.save(tipoSeguro);
    }
}
