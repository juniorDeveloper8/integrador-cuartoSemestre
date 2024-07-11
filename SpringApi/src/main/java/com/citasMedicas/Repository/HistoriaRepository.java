package com.citasMedicas.Repository;

import com.citasMedicas.Entities.Historia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HistoriaRepository extends CrudRepository<Historia, Integer> {

    List<Historia> findByActivoTrue();
}
