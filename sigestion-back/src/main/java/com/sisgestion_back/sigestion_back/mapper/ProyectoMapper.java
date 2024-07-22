package com.sisgestion_back.sigestion_back.mapper;


import com.sisgestion_back.sigestion_back.model.dto.ProyectoRequestDTO;
import com.sisgestion_back.sigestion_back.model.dto.ProyectoResponseDTO;
import com.sisgestion_back.sigestion_back.model.entity.Especialidad;
import com.sisgestion_back.sigestion_back.model.entity.Proyecto;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component

public class ProyectoMapper {

    private final ModelMapper modelMapper;

    public Proyecto convertToEntity(ProyectoRequestDTO proyectoRequestDTO) {
        return modelMapper.map(proyectoRequestDTO, Proyecto.class);
    }

    public ProyectoResponseDTO convertToDTO(Proyecto proyecto) {
        ProyectoResponseDTO proyectoResponseDTO = modelMapper.map(proyecto, ProyectoResponseDTO.class);
        if (proyecto.getEspecialidades() != null) {
            List<Especialidad> especialidades = proyecto.getEspecialidades();
            proyectoResponseDTO.setEspecialidades(especialidades);
        }
        return proyectoResponseDTO;
    }

    public List<ProyectoResponseDTO> convertToDTO(List<Proyecto> proyectos) {

        return proyectos.stream()
                .map(this::convertToDTO)
                .toList();
    }

}
