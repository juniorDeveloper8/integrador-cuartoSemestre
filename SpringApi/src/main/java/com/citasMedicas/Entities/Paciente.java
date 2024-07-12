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

@Table(name = "paciente")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pa")
    private Integer idPa;

    @Column(name = "nom_pa")
    private String nomPa;
    @Column(name = "ape_pa")
    private String apePa;
    @Column(name = "correo_pa")
    private String correoPa;
    @Column(name = "psw_pa")
    private String pswPa;
    @Column(name = "dni_pa")
    private String dniPa;
    @Column(name = "fecNa_pa", columnDefinition = "DATETIME")
    private Date fecNaPa;
    @Column(columnDefinition = "TINYINT(1)" )
    private boolean activo;

    @ManyToOne
    @JoinColumn(name = "id_dis")
    @JsonIgnore
    private Distrito distrito;

    @ManyToOne
    @JoinColumn(name = "id_tipseg")
    @JsonIgnore
    private TipoSeguro tipoSeguro;

    @ManyToOne
    @JoinColumn(name = "id_tidni")
    @JsonIgnore
    private TipoDni tipoDni;

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Historia> historiaList = new ArrayList<>();

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Cita> citaList = new ArrayList<>();

    public void desactivarPaciente() {
        this.activo = false;
    }
}
