package com.citasMedicas.Controllers;

import com.citasMedicas.DTO.DTORol;
import com.citasMedicas.Entities.Rol;
import com.citasMedicas.Services.IRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api")
public class RolController {

    @Autowired
    private IRolService rolService;

    @GetMapping(value = "/rol/{id}")
    public ResponseEntity<?> findById(@PathVariable Integer id) {
        Optional<Rol> rolOptional = rolService.findById(id);

        if (rolOptional.isPresent()) {
            Rol rol = rolOptional.get();

            DTORol dtoRol = DTORol.builder()
                    .descripcion(rol.getDecripcion())
                    .userList(rol.getUserList())
                    .build();

            return ResponseEntity.ok(dtoRol);
        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping(value = "rol")
    public ResponseEntity<?> findAll() {

        try {

            List<DTORol> dtoRolList = rolService.findAll().stream()
                    .map(rol -> DTORol.builder()
                            .descripcion(rol.getDecripcion())
                            .userList(rol.getUserList())
                            .build())
                    .toList();
            return ResponseEntity.ok(dtoRolList);

        } catch (Exception e) {
           return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping(value = "/rol")
    public ResponseEntity<?> save(@RequestBody DTORol dtoRol) throws URISyntaxException {

        if (dtoRol.getDescripcion().isBlank() || dtoRol.getUserList() == null) {
            return ResponseEntity.badRequest().build();
        }

        Rol rol = Rol.builder()
                .decripcion(dtoRol.getDescripcion())
                .userList(dtoRol.getUserList())
                .build();
        rolService.save(rol);

        return ResponseEntity.created(new URI("/api/rol")).build();
    }

    @PutMapping(value = "/rol/{id}")
    public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody DTORol dtoRol) {
        Optional<Rol> rolOptional = rolService.findById(id);

        if (rolOptional.isPresent()) {
            Rol rol = rolOptional.get();
            rol.setDecripcion(dtoRol.getDescripcion());
            rol.setUserList(dtoRol.getUserList());
            rolService.save(rol);
            return ResponseEntity.ok("rol actualizado");

        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping(value = "/rol/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) {

        if (id != null) {
            rolService.deleteById(id);
            return ResponseEntity.ok("rol eliminado");
        }
        return ResponseEntity.badRequest().build();
    }

}
