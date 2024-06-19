package com.citasMedicas.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "especialdad")
public class Especialdad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "e_id")
    private Integer eId;
    @Column(name = "e_nombre")
    private String eNombre;

    @Column(name = "e_codigo")
    private String eCodigo;

    @Column(name = "e_age")
    private Integer eAge;

    @Column(name = "e_status")
    private boolean eStatus;

    //relacion con doc-especialidad
    @OneToMany(mappedBy = "especialdad", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = DocEspecialidad.class)
    private List<DocEspecialidad> docEspecialidadList;

    //metodo de guardar

    //metodo de actualizar

    //metodo de eliminar
    public void desactivarCita() {
        this.eStatus = false;
    }
}
