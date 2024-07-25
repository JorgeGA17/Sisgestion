package com.sisgestion_back.sigestion_back.mapper;

import com.sisgestion_back.sigestion_back.model.dto.*;
import com.sisgestion_back.sigestion_back.model.entity.Proyecto;
import jakarta.annotation.PostConstruct;
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
        return modelMapper.map(proyecto, ProyectoResponseDTO.class);
    }

    public List<ProyectoResponseDTO> convertToDTO(List<Proyecto> proyectos) {

        return proyectos.stream()
                .map(this::convertToDTO)
                .toList();
    }

}
