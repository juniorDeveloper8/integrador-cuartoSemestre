package com.citasMedicas.DTO;

import com.citasMedicas.Entities.User;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DTOIdentificacion {

    private boolean tipoDni;
    private String dni;

    private List<User> userList;
}
