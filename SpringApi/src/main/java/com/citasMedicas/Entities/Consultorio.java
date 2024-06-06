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
@Table(name = "consultorio")
public class Consultorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "c_id")
    private Integer cId;

    @Column(name = "c_nom")
    private String cNom;
    @Column(name = "c_ubicacion")
    private String cUbicacion;

    //relacion con historia clinica
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = HistorialClinico.class)
    private HistorialClinico historialClinico;
}
