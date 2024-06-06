package com.citasMedicas.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cita")
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cita")
    private Integer idCita;
    private boolean status;

    // relacion con usuario
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = User.class)
    private User user;

    // relacion con historial clinico
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = HistorialClinico.class)
    private HistorialClinico historialClinico;

    //metodo de guardar

    //metodo de actualizar

    //metodo de eliminar
    public void desactivarCita() {
        this.status = false;
    }

}
