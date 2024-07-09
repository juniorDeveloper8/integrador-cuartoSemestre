package com.citasMedicas.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Table(name = "medico")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_me")
    private Integer idMe;
    @Column(columnDefinition = "TINYINT(1)" )
    private boolean activo;

    @ManyToOne
    @JoinColumn(name = "id_es")
    @JsonIgnore
    private Especialidad especialidad;

    @ManyToOne
    @JoinColumn(name = "id_em")
    @JsonIgnore
    private Empleado empleado;

    @OneToMany(mappedBy = "medico", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<HorarioMedico> horarioMedicoList = new ArrayList<>();
}
