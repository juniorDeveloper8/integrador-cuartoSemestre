package com.citasMedicas.Services.Implementation;

import com.citasMedicas.Entities.Cita;
import com.citasMedicas.Repository.CitaRepository;
import com.citasMedicas.Services.ICitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CitaServiceImp implements ICitaService {

    @Autowired
    private CitaRepository citaRepository;

    @Override
    public List<Cita> findByActivoTrue() {
        return (List<Cita>) citaRepository.findByActivoTrue();
    }

    @Override
    public Optional<Cita> findById(Integer id) {
        return citaRepository.findById(id);
    }

    @Override
    public void save(Cita cita) {
        citaRepository.save(cita);
    }

    @Override
    public void deleteById(Integer id) {
       Optional<Cita> citaOptional = citaRepository.findById(id);

       if (citaOptional.isPresent()) {
           Cita cita = citaOptional.get();

           cita.desactivarCita();
           citaRepository.save(cita);
       }
    }
}
