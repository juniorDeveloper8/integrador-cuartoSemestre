package com.citasMedicas.Controllers;

import com.citasMedicas.DTO.DTOUser;
import com.citasMedicas.Entities.User;
import com.citasMedicas.Services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class DoctorController {

    @Autowired
    private IUserService userService;

    @GetMapping(value = "/doctor/{id}")
    public ResponseEntity<?> findByIdDoctor(@PathVariable Integer id) {
        Optional<User> userOptional = userService.findById(id);

        if(userOptional.isPresent()) {
            User user = userOptional.get();

            DTOUser dtoUser = DTOUser.builder()
                    .uNombre(user.getUNombre())
                    .uApellido(user.getUApellido())
                    .uCorreo(user.getUCorreo())
                    .identificacion(user.getIdentificacion())
                    .docEspecialidadList(user.getDocEspecialidadList())
                    .build();

            return ResponseEntity.ok(dtoUser);
        }
        return ResponseEntity.notFound().build();
    }
}
