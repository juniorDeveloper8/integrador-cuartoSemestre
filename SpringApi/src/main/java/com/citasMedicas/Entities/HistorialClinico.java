package com.citasMedicas.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "historial_clinico")
public class HistorialClinico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "h_id")
    private Integer hId;
    private Date date;
    private Integer age;

    // relacion con Usuario
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = User.class)
    private User user;

    //Relacion con consultorio
    @OneToMany(mappedBy = "historialClinico", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Consultorio.class)
    private List<Consultorio> consultorioList ;

    //Relacion con cita
    @OneToMany(mappedBy = "historialClinico", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Cita.class)
    private List<Cita> citaList;

    //Relacion con tipo de atencion
    @OneToMany(mappedBy = "historialClinico", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = TipoAtencion.class)
    private List<TipoAtencion> tipoAtencionList ;
}
