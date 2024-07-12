package com.citasMedicas.Services.Implementation;

import com.citasMedicas.Entities.Cargo;
import com.citasMedicas.Repository.CargoRepository;
import com.citasMedicas.Services.ICargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CargoServiceImp implements ICargoService {

    @Autowired
    private CargoRepository cargoRepository;

    @Override
    public List<Cargo> findAll() {
        return (List<Cargo>) cargoRepository.findAll();
    }

    @Override
    public Optional<Cargo> findById(Integer id) {
        return cargoRepository.findById(id);
    }

    @Override
    public void save(Cargo cargo) {
        cargoRepository.save(cargo);
    }
}
