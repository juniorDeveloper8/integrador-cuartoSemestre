package com.citasMedicas.Services.Implements;

import com.citasMedicas.Entities.Rol;
import com.citasMedicas.Repositories.IRolRepository;
import com.citasMedicas.Services.IRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolServiceImplements implements IRolService {

    @Autowired
    private IRolRepository rolRepository;

    @Override
    public List<Rol> findAll() {
        return (List<Rol>) rolRepository.findAll();
    }

    @Override
    public Rol findById(Integer id) {
        return rolRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Rol rol) {
        rolRepository.save(rol);
    }

    @Override
    public void update(Integer id, Rol rol) {
        // toca crear el dto
    }

    @Override
    public void deleteById(Integer id) {
        rolRepository.deleteById(id);
    }
}
