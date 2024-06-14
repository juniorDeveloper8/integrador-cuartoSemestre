package com.citasMedicas.DTO;

import com.citasMedicas.Entities.HistorialClinico;
import com.citasMedicas.Entities.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DTOCita {

    private boolean status;

    private User user;

    private HistorialClinico historialClinico;

}
