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
public class UserController {

    @Autowired
    private IUserService userService;

    //metodo listar por id
    @GetMapping(value = "/user/{id}")
    public ResponseEntity<?> findByIdUser(@PathVariable Integer id) {
        Optional<User> userOptional = userService.findById(id);

        if(userOptional.isPresent()) {
            User user = userOptional.get();

            DTOUser dtoUser = DTOUser.builder()
                    .uNombre(user.getUNombre())
                    .uApellido(user.getUApellido())
                    .uCorreo(user.getUCorreo())
                    .identificacion(user.getIdentificacion())
                    .citaList(user.getCitaList())
                    .historialClinicoList(user.getHistorialClinicoList())
                    .build();

            return ResponseEntity.ok(dtoUser);
        }
        return ResponseEntity.notFound().build();
    }

    //metodo listar todos los usuarios
    @GetMapping(value = "/users")
    public ResponseEntity<?> findAll() {

        try {

            List<DTOUser> dtoUserList = userService.findAll().stream()
                    .map(user -> DTOUser.builder()
                            .uNombre(user.getUNombre())
                            .uApellido(user.getUApellido())
                            .uCorreo(user.getUCorreo())
                            .identificacion(user.getIdentificacion())
                            .build()
                    )
                    .toList();
            return ResponseEntity.ok(dtoUserList);
        }catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    //metodo guardar
    @PostMapping(value ="/user")
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
               .build();
       userService.save(user);

       return ResponseEntity.created(new URI("/api/user")).build();
    }

    //metodo actualizar
    @PutMapping(value = "/user/{id}")
    public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody DTOUser dtoUser ){
        Optional<User> userOptional = userService.findById(id);

        if(userOptional.isPresent()) {
            User user = userOptional.get();
            user.setUNombre(dtoUser.getUNombre());
            user.setUApellido(dtoUser.getUApellido());
            user.setUCorreo(dtoUser.getUCorreo());
            user.setIdentificacion(dtoUser.getIdentificacion());
            userService.save(user);
            return ResponseEntity.ok("usuario actualizado: 👻");
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping(value = "/user/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) {
        if (id != null ){
            userService.deleteById(id);
            return ResponseEntity.ok("usuario eliminado correctamente: 👻");
        }
        return ResponseEntity.badRequest().build();
    }

}
