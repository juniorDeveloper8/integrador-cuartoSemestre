package com.citasMedicas.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Table(name = "tipo_seguro")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TipoSeguro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_se")
    private Integer idSe;

    @Column(name = "des_tipseg")
    private String desTipSeg;

    @OneToMany(mappedBy = "tipoSeguro", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Paciente> pacienteList = new ArrayList<>();
}
