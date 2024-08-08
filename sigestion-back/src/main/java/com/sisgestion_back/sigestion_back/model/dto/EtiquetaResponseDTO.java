package com.sisgestion_back.sigestion_back.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EtiquetaResponseDTO {

    private Long etiquetaPk;
    private String xNombre;
    private String xSlug;
    private String nEstado;
    private String xCampo;
    private Instant fFechaRegistro;
    private Instant fFechaModificacion;

}
