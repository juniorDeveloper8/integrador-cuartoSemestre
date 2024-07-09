package com.citasMedicas.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Table(name = "empleado")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_em")
    private Integer idEm;

    @Column(name = "nom_em")
    private String nomEm;
    @Column(name = "ape_em")
    private String apeEm;
    @Column(name = "correo_em")
    private String correoEm;
    @Column(name = "psw_em")
    private String pswEm;
    @Column(name = "dni_em")
    private String dniEm;

    @Column(name = "cel_em")
    private String celEm;
    @Column(columnDefinition = "TINYINT(1)" )
    private boolean activo;

    @ManyToOne
    @JoinColumn(name = "id_ca")
    @JsonIgnore
    private Cargo cargo;

    @ManyToOne
    @JoinColumn(name = "id_tidni")
    @JsonIgnore
    private TipoDni tipoDni;

    @OneToMany(mappedBy = "empleado", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Medico> medicoList = new ArrayList<>();
}
