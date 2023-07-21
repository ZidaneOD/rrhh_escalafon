package com.escalafon.proyecto_escalafon.app.models.entitys;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Max;
import java.io.Serializable;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "distritos")
@Getter @Setter
public class DistritoEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_distrito", nullable = false)
    private Integer idDistrito;

    @NotEmpty
    @Max(150)
    @Column(name = "nombre_distrito",length = 150)
    private String nombreDistrito;

    @NotNull
    private Boolean estado;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_provincia", referencedColumnName = "id_provincia")
    private ProvinciaEntity provincia;
}
