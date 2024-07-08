package com.citasMedicas.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Table(name = "distrito")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Distrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dis")
    private Integer idDis;
    @Column(name = "nom_dis")
    private String nomDis;

    @OneToMany(mappedBy = "distrito", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Paciente> pacienteList = new ArrayList<>();
}
