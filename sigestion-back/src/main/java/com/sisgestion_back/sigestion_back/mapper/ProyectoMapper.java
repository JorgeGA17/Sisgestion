package com.sisgestion_back.sigestion_back.mapper;

import com.sisgestion_back.sigestion_back.model.dto.*;
import com.sisgestion_back.sigestion_back.model.entity.Proyecto;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Component

public class ProyectoMapper {

    private final ModelMapper modelMapper;

    @PostConstruct
    public void init() {
        modelMapper.typeMap(Proyecto.class, ProyectoResponseDTO.class)
                .addMappings(mapper -> mapper.skip(ProyectoResponseDTO::setEspecialidades));
    }

    public Proyecto convertToEntity(ProyectoRequestDTO proyectoRequestDTO) {
        return modelMapper.map(proyectoRequestDTO, Proyecto.class);
    }

    public ProyectoResponseDTO convertToDTO(Proyecto proyecto) {
        ProyectoResponseDTO dto = modelMapper.map(proyecto, ProyectoResponseDTO.class);
        dto.setEspecialidades(new HashSet<>(proyecto.getEspecialidades())); // Incluye las especialidades en la respuesta
        return dto;
    }

    public List<ProyectoResponseDTO> convertToDTO(List<Proyecto> proyectos) {

        return proyectos.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

}
