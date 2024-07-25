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
public class EspecialidadResponseDTO {

    private Long especialidadPk;
    private String xNombre;
    private Instant fFechaRegistro;
    private Instant fFechaModificacion;
    private List<Proyecto> proyectos;
}
