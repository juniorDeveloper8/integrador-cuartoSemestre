package com.citasMedicas.Services.Implementation;

import com.citasMedicas.Entities.HorarioMedico;
import com.citasMedicas.Repository.HorarioMedicoRepository;
import com.citasMedicas.Services.IHorarioMedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HorarioMedicoServiceImp implements IHorarioMedicoService {

    @Autowired
    private HorarioMedicoRepository horarioMedicoRepository;

    @Override
    public List<HorarioMedico> findByEstHorario(boolean estHorario) {
        return (List<HorarioMedico>) horarioMedicoRepository.findByEstHorario(estHorario);
    }

    @Override
    public Optional<HorarioMedico> findById(Integer id) {
        return horarioMedicoRepository.findById(id);
    }

    @Override
    public void save(HorarioMedico horarioMedico) {
        horarioMedicoRepository.save(horarioMedico);
    }

    @Override
    public void deleteById(Integer id) {
// verremos
    }
}
