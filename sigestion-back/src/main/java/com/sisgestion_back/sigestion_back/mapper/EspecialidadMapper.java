package com.sisgestion_back.sigestion_back.mapper;

import com.sisgestion_back.sigestion_back.model.dto.CorteRequestDTO;
import com.sisgestion_back.sigestion_back.model.dto.CorteResponseDTO;
import com.sisgestion_back.sigestion_back.model.dto.EspecialidadRequestDTO;
import com.sisgestion_back.sigestion_back.model.dto.EspecialidadResponseDTO;
import com.sisgestion_back.sigestion_back.model.entity.Corte;
import com.sisgestion_back.sigestion_back.model.entity.Especialidad;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class EspecialidadMapper {

    private final ModelMapper modelMapper;

    public Especialidad convertToEntity(EspecialidadRequestDTO especialidadRequestDTO) {
        return modelMapper.map(especialidadRequestDTO, Especialidad.class);
    }

    public EspecialidadResponseDTO convertToDTO(Especialidad especialidad) {
        return modelMapper.map(especialidad, EspecialidadResponseDTO.class);
    }

    public List<EspecialidadResponseDTO> convertToDTO(List<Especialidad> especialidades) {

        return especialidades.stream()
                .map(this::convertToDTO)
                .toList();
    }

}
