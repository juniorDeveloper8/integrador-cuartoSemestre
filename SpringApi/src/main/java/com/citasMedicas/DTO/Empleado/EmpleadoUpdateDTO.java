package com.citasMedicas.DTO.Empleado;


import jakarta.validation.constraints.NotNull;

public record EmpleadoUpdateDTO(
   @NotNull
   Integer idEm,
   String nomEm,
   String apeEm,
   String correoEm,
   String pswEm,
   String celEm
) {}
