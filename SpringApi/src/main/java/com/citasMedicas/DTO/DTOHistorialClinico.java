package com.citasMedicas.DTO;

import com.citasMedicas.Entities.Cita;
import com.citasMedicas.Entities.Consultorio;
import com.citasMedicas.Entities.TipoAtencion;
import com.citasMedicas.Entities.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DTOHistorialClinico {

    private Date date;
    private Integer age;

    private User user;
    private List<Consultorio> consultorios = new ArrayList<>();

    private List<Cita> citas = new ArrayList<>();
    private List<TipoAtencion> tipoAtencionList = new ArrayList<>();
}
