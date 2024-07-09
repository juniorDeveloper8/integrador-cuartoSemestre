package com.citasMedicas.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Table(name = "horario_medico")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HorarioMedico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_horario")
    private Integer idHorario;

    @Column(name = "fec_horario", columnDefinition = "DATETIME")
    private Date fecHorario;

    @Column(columnDefinition = "DATETIME")
    private Date hora;

    @Column(name = "est_horario", columnDefinition = "TINYTEXT")
    private boolean estHorario;

    @ManyToOne
    @JoinColumn(name = "id_dis")
    @JsonIgnore
    private Medico medico;

    @OneToMany(mappedBy = "horarioMedico", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Cita> citaList = new ArrayList<>();
}
