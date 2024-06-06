package com.citasMedicas.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "identificacion")
public class Identificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "i_id")
    private Integer iId;

    @Column(name = "tipo_dni")
    private boolean tipoDni;

    private String dni;

    // relacion con usuario
    @OneToMany(mappedBy = "identificacion", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = User.class)
    private List<User> userList;
}
