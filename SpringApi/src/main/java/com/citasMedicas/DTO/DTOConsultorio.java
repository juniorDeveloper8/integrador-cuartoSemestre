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
public class DTOConsultorio {

    private String cNom;
    private String cUbicacion;

    private HistorialClinico historialClinico;
}