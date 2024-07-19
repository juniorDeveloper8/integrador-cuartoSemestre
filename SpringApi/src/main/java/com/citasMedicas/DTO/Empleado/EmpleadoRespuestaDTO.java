package com.citasMedicas.DTO.Empleado;

import jakarta.validation.constraints.NotBlank;

public record EmpleadoRespuestaDTO(

        String nomEm,
        String apeEm,
        String correoEm,
        String celEm,
        String dniEm,
        String des
) {}
