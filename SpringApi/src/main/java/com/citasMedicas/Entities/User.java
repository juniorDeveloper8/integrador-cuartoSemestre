package com.citasMedicas.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuario")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "u_id")
    private Integer uId;
    @Column(name = "u_nombre")
    private String uNombre;
    @Column(name = "u_apellido")
    private String uApellido;
    @Column(name = "u_correo")
    private String uCorreo;
    @Column(name = "u_psw")
    private String uPsw;// contracena o password

    // relacion con rol

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Rol.class)
    private Rol rol;

    // relacion con identificaicon
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Identificacion.class)
    private Identificacion identificacion;

    // relacion con doc-especialidad
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = DocEspecialidad.class)
    private List<DocEspecialidad> docEspecialidadList;

    //relacion cita
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Cita.class)
    private List<Cita> citaList;

    //relacion historial clinico
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = HistorialClinico.class)
    private List<HistorialClinico> historialClinicoList;




}
