package com.citasMedicas.Repositories;

import com.citasMedicas.Entities.Identificacion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IIdentificacionRepository extends CrudRepository<Identificacion, Integer> {
}
