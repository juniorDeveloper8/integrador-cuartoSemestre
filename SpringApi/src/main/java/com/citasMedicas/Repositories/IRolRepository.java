package com.citasMedicas.Repositories;

import com.citasMedicas.Entities.Rol;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends CrudRepository<Rol, Integer> {
}
