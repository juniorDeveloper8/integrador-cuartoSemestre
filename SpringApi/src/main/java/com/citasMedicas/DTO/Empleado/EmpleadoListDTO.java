package com.citasMedicas.DTO.Empleado;

import com.citasMedicas.Entities.Empleado;
import com.citasMedicas.Entities.TipoDni;

public record EmpleadoListDTO(
        Integer idEm,
        String nomEm,
        String apeEm,
        String correoEm,
        String celEm,
        String dniEm,
        String des,
        String cargo
) {

    public EmpleadoListDTO(Empleado empleado, TipoDni tipoDni) {
        this(
                empleado.getIdEm(),
                empleado.getNomEm(),
                empleado.getApeEm(),
                empleado.getCorreoEm(),
                empleado.getCelEm(),
                empleado.getDniEm(),
                tipoDni.getDes(),
                empleado.getCargo().toString()
        );
    }
}
