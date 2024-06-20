package com.citasMedicas.Controllers;

import com.citasMedicas.DTO.DTOUser;
import com.citasMedicas.Entities.User;
import com.citasMedicas.Services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class DoctorController {

    @Autowired
    private IUserService doctor;


    @GetMapping(value = "/doctor/{id}")
    public ResponseEntity<?> findByIdDoctor(@PathVariable Integer id) {
        Optional<User> userOptional = doctor.findById(id);

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

    @GetMapping(value = "/doctor")
    public ResponseEntity<?> findAll() {

        try {
            List<DTOUser> dtoUserList = doctor.findAll().stream()
                    .map(doc -> DTOUser.builder()
                            .uNombre(doc.getUNombre())
                            .uApellido(doc.getUApellido())
                            .uCorreo(doc.getUCorreo())
                            .identificacion(doc.getIdentificacion())
                            .docEspecialidadList(doc.getDocEspecialidadList())
                            .build()
                    )
                    .toList();
            return ResponseEntity.ok(dtoUserList);

        } catch (Exception e) {

            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping(value = "/doctor")
    public ResponseEntity<?> save(@RequestBody DTOUser dtoUser) throws URISyntaxException {

         if(dtoUser.getUNombre().isBlank() || dtoUser.getUApellido().isBlank() || dtoUser.getUCorreo().isBlank() || dtoUser.getUPsw().isBlank() || dtoUser.getIdentificacion() == null) {
           return ResponseEntity.badRequest().build();
       }

         User user = User.builder()
                 .uNombre(dtoUser.getUNombre())
                 .uApellido(dtoUser.getUApellido())
                 .uCorreo(dtoUser.getUCorreo())
                 .uPsw(dtoUser.getUPsw())
                 .identificacion(dtoUser.getIdentificacion())
                 .docEspecialidadList(dtoUser.getDocEspecialidadList())
                 .build();
         doctor.save(user);

         return ResponseEntity.created(new URI("/api/doctor")).build();
    }

    @PutMapping(value = "/doctor/{id}")
    public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody DTOUser dtoUser) {
        Optional<User> userOptional = doctor.findById(id);

        if(userOptional.isPresent()){
            User user = userOptional.get();
            user.setUNombre(dtoUser.getUNombre());
            user.setUApellido(dtoUser.getUApellido());
            user.setUCorreo(dtoUser.getUCorreo());
            user.setIdentificacion(dtoUser.getIdentificacion());
            user.setDocEspecialidadList(dtoUser.getDocEspecialidadList());
            doctor.save(user);

            return ResponseEntity.ok("doctor actualizado");
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping(value = "/doctor/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) {
        if (id != null) {
            doctor.deleteById(id);
            return ResponseEntity.ok("doctor eliminado");
        }
        return ResponseEntity.badRequest().build();
    }
}
