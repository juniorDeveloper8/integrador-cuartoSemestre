package com.citasMedicas.Services.Implementation;

import com.citasMedicas.Entities.Medico;
import com.citasMedicas.Repository.MedicoRepository;
import com.citasMedicas.Services.IMedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicoServiceImp implements IMedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    @Override
    public List<Medico> findByActivoTrue() {
        return (List<Medico>) medicoRepository.findByActivoTrue();
    }

    @Override
    public Optional<Medico> findById(Integer id) {
        return medicoRepository.findById(id);
    }

    @Override
    public void save(Medico medico) {

        medicoRepository.save(medico);
    }

    @Override
    public void deleteById(Integer id) {
        Optional<Medico> medicoOptional = medicoRepository.findById(id);

        if (medicoOptional.isPresent()) {
            Medico medico = medicoOptional.get();
            medico.desactivarMedico();
            medicoRepository.save(medico);
        }
    }
}
