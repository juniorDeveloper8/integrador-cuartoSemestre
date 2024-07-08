package com.citasMedicas.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Table(name = "tipo_dni")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TipoDni {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tidni")
    private Integer idTiDni;

    @Column(columnDefinition = "TINYINT(1)")
    private boolean tipo;

    private String des;

    @OneToMany(mappedBy = "tipoDni", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Paciente> pacienteList = new ArrayList<>();
}
