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
public class DTORol {

   private boolean tipo;
   private String descripcion;

   private List<User> userList;

}
