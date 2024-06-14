package com.citasMedicas.DTO;

import com.citasMedicas.Entities.DocEspecialidad;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DTOEspecialidad {

    private String eNombre;
    private String eCodigo;
    private Integer eAge;
    private boolean eStatus;

    private List<DocEspecialidad> docEspecialidadList;

}
