package com.citasMedicas.Repositories;

import com.citasMedicas.Entities.TipoAtencion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoAtencionRepository extends CrudRepository<TipoAtencion, Integer> {
}
