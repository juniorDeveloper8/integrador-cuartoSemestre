package com.citasMedicas.DTO.Empleado;

import jakarta.validation.constraints.NotBlank;

public record EmpleadoSaveDTO(
        @NotBlank
        String nomEm,
        @NotBlank
        String apeEm,
        @NotBlank
        String correoEm,
        @NotBlank
        String pswEm,
        @NotBlank
        String dniEm,
        @NotBlank
        String celEm
) {}
