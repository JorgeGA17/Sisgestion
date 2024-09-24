package com.sisgestion_back.sigestion_back.model.dto;


import com.sisgestion_back.sigestion_back.model.entity.Corte;
import com.sisgestion_back.sigestion_back.model.entity.Estado;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProyectoResponseDTO {

    private Long proyectopk;

    private String xnombreproyecto;

    private String xslug;

    private String xproblematica;

    private String xresumen;

    private String xobjetivogeneral;

    private Integer xinnovacion;

    private Integer ximpacto;

    private Integer xsostenibilidad;

    private Integer xreplicabilidad;

    private String npublicacion;

    private Integer npeso;

    private String ffecha;

    private Corte cortefk;

    private Estado estadofk;

    private Set<EspecialidadResponseDTO> especialidades;

    private Set<JerarquiaResponseDTO> jerarquias;

    private Set<EjeResponseDTO> ejes;

    private Set<EtiquetaResponseDTO> etiquetas;

    private Set<PersonalResponseDTO> personas;
}
