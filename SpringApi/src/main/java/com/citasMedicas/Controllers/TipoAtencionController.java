package com.citasMedicas.Controllers;

import com.citasMedicas.DTO.DTOTipoAtencion;
import com.citasMedicas.Entities.TipoAtencion;
import com.citasMedicas.Services.ITipoAtencionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TipoAtencionController {

    @Autowired
    private ITipoAtencionService atencionService;

    @GetMapping(value = "atencion/{id}")
    public ResponseEntity<?> findByIdAtencion(@PathVariable Integer id) {
        Optional<TipoAtencion> atencionOptional = atencionService.findById(id);

        if(atencionOptional.isPresent()) {
            TipoAtencion atencion = atencionOptional.get();

            DTOTipoAtencion dtoTipoAtencion = DTOTipoAtencion.builder()
                    .tTipo(atencion.isTTipo())
                    .historialClinico(atencion.getHistorialClinico())
                    .tDescription(atencion.getTDescription())
                    .build();
            return ResponseEntity.ok(dtoTipoAtencion);
        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping(value = "atencion")
    public ResponseEntity<?> findAllAtencion() {

        try {

            List<DTOTipoAtencion> dtoTipoAtencionList = atencionService.findAll().stream()
                    .map(atencion -> DTOTipoAtencion.builder()
                            .tDescription(atencion.getTDescription())
                            .tTipo(atencion.isTTipo())
                            .historialClinico(atencion.getHistorialClinico())
                            .build()
                    )
                    .toList();

            return ResponseEntity.ok(dtoTipoAtencionList);
        }catch (Exception e) {
           return ResponseEntity.badRequest().build();
        }

    }

    @PostMapping(value = "atencion")
    public ResponseEntity<?> save(@RequestBody DTOTipoAtencion dtoTipoAtencion) throws URISyntaxException {

        if(dtoTipoAtencion.getHistorialClinico() == null || dtoTipoAtencion.getTDescription().isBlank()) {
            return ResponseEntity.badRequest().build();
        }

        TipoAtencion atencion = TipoAtencion.builder()
                .tTipo(dtoTipoAtencion.isTTipo())
                .historialClinico(dtoTipoAtencion.getHistorialClinico())
                .tDescription(dtoTipoAtencion.getTDescription())
                .build();
        atencionService.save(atencion);

        return ResponseEntity.created(new URI("/api/atencion")).build();
    }

    @PutMapping(value = "/atencion/{id}")
    public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody DTOTipoAtencion dtoTipoAtencion) {
        Optional<TipoAtencion> atencionOptional = atencionService.findById(id);

        if(atencionOptional.isPresent()){
            TipoAtencion atencion = atencionOptional.get();
            atencion.setTTipo(dtoTipoAtencion.isTTipo());
            atencion.setTDescription(dtoTipoAtencion.getTDescription());
            atencion.setHistorialClinico(dtoTipoAtencion.getHistorialClinico());
            atencionService.save(atencion);

            return ResponseEntity.ok("horario de atencion ah sido cambiado");
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping(value = "/atencion/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) {

        if (id != null) {
            atencionService.deleteById(id);
            return ResponseEntity.ok("atencion eleiminada");
        }
        return ResponseEntity.badRequest().build();
    }
}



