package com.citasMedicas.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Table(name = "historia")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Historia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_his")
    private Integer idHis;

    @Column(name = "fecha_ing", columnDefinition = "DATETIME")
    private Date fechaIng;

    @Column(name = "intervenciones_quirurgicas", columnDefinition = "TINYTEXT")
    private boolean intervencionesQuirugicas;

    @Column(columnDefinition = "TINYTEXT")
    private boolean hipertencion;

    @Column(columnDefinition = "TINYTEXT")
    private boolean diabetes;

    @Column(columnDefinition = "TINYINT(1)")
    private boolean activo;

    private String observaciones;

    @Enumerated(EnumType.STRING)
    private Alergias alergias;

    @Enumerated(EnumType.STRING)
    private Vacunas vacunas;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_sangre")
    private TipoSangre tipoSangre;


    @ManyToOne
    @JoinColumn(name = "id_pa")
    @JsonIgnore
    private Paciente paciente;

}
