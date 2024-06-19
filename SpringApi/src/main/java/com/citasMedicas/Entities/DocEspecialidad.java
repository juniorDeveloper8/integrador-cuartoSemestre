package com.citasMedicas.Entities;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "doc_especialidad")
public class DocEspecialidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "docEs_id")
    private Integer docEsId;

    // relacion con usuario q va hacer funcion de doctor
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = User.class)
    private User user;

    // relacion con especialidad
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Especialdad.class)
    private Especialdad especialdad;
}
