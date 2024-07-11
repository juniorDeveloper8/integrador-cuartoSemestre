package com.citasMedicas.Repository;

import com.citasMedicas.Entities.TipoDni;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TipoDniRepository extends CrudRepository<TipoDni, Integer> {

    List<TipoDni> findByTipo(boolean tipo);
}
