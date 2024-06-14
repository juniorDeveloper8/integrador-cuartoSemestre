package com.citasMedicas.DTO;

import com.citasMedicas.Entities.Especialdad;
import com.citasMedicas.Entities.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DTODocEspecialidad {

    private User user;
    private Especialdad especialdad;
}
