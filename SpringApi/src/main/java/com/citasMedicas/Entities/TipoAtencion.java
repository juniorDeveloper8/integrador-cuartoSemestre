package com.citasMedicas.Entities;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "tipo_atencion")
public class TipoAtencion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "t_id")
    private Integer tId;

    @Column(name = "t_tipo")
    private boolean tTipo;

    @Column(name = "t_descripcion")
    private String tDescription;

    //relacion con historial clinico
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = HistorialClinico.class)
    private HistorialClinico historialClinico;
}
