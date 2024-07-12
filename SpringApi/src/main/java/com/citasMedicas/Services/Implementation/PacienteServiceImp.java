package com.citasMedicas.Services.Implementation;

import com.citasMedicas.Entities.Paciente;
import com.citasMedicas.Repository.PacienteRepository;
import com.citasMedicas.Services.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteServiceImp implements IPacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    @Override
    public List<Paciente> findByActivoTrue() {
        return (List<Paciente>) pacienteRepository.findByActivoTrue();
    }

    @Override
    public Optional<Paciente> findById(Integer id) {
        return pacienteRepository.findById(id);
    }

    @Override
    public void save(Paciente paciente) {
        pacienteRepository.save(paciente);
    }

    @Override
    public void deleteById(Integer id) {
        Optional<Paciente> pacienteOptional = pacienteRepository.findById(id);

        if (pacienteOptional.isPresent()) {
            Paciente paciente = pacienteOptional.get();
            paciente.desactivarPaciente();
            pacienteRepository.save(paciente);
        }
    }
}
