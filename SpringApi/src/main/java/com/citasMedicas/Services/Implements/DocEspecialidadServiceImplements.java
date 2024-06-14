package com.citasMedicas.Services.Implements;

import com.citasMedicas.Entities.DocEspecialidad;
import com.citasMedicas.Repositories.IDocEspecialidadRepository;
import com.citasMedicas.Services.IDocEspecialidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocEspecialidadServiceImplements implements IDocEspecialidadService {

    @Autowired
    private IDocEspecialidadRepository docEspecialidadRepository;

    @Override
    public List<DocEspecialidad> findAll() {
        return (List<DocEspecialidad>) docEspecialidadRepository.findAll();
    }

    @Override
    public Optional<DocEspecialidad> findById(Integer id) {
        return docEspecialidadRepository.findById(id);
    }

    @Override
    public void save(DocEspecialidad docEspecialidad) {
        docEspecialidadRepository.save(docEspecialidad);
    }

    @Override
    public void deleteById(Integer id) {
        docEspecialidadRepository.deleteById(id);
    }
}
