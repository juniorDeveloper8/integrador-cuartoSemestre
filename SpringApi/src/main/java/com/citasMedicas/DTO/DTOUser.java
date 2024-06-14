package com.citasMedicas.DTO;

import com.citasMedicas.Entities.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DTOUser {

    private String uNombre;
    private String uApellido;
    private String uCorreo;
    private String uPsw;
    private Rol rol;
    private Identificacion identificacion;

    private List<DocEspecialidad> docEspecialidadList;
    private List<Cita> citaList;
    private List<HistorialClinico> historialClinicoList;

}
