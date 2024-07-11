package com.citasMedicas.Repository;

import com.citasMedicas.Entities.TipoSeguro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoSeguroRepository extends CrudRepository<TipoSeguro, Integer> {
}
