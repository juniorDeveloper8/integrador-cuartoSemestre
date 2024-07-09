package com.citasMedicas.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Table(name = "consultorio")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Consultorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_co")
    private Integer idCo;

    @Column(name = "nro_co")
    private Integer nroCon;

    @OneToMany(mappedBy = "consultorio", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Cita> citaList = new ArrayList<>();
}
