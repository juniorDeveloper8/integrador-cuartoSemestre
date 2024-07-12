package com.citasMedicas.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "cita")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ci")
    private Integer idCi;

    @Column(columnDefinition = "TINYINT(1)" )
    private boolean activo;

    @ManyToOne
    @JoinColumn(name = "id_pa")
    @JsonIgnore
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "id_horario")
    @JsonIgnore
    private HorarioMedico horarioMedico;

    @ManyToOne
    @JoinColumn(name = "id_co")
    @JsonIgnore
    private Consultorio consultorio;

    public void desactivarCita() {
        this.activo = false;
    }
}
