package com.sisgestion_back.sigestion_back.model.dto;

import com.sisgestion_back.sigestion_back.model.entity.Proyecto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class EstadoResponseDTO {
    private Long estadoPk;
    private String xNombre;
    private String xSlug;
    private String xResumen;
    private Instant fFechaRegistro;
    private Instant fFechaModificacion;

}
