package com.citasMedicas.DTO;

import com.citasMedicas.Entities.HistorialClinico;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DTOTipoAtencion {

    private boolean tTipo;
    private String tDescription;
    private HistorialClinico historialClinico;
}
