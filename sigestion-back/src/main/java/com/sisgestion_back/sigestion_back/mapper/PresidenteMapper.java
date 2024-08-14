package com.sisgestion_back.sigestion_back.mapper;

import com.sisgestion_back.sigestion_back.model.dto.ComisionRequestDTO;
import com.sisgestion_back.sigestion_back.model.dto.ComisionResponseDTO;
import com.sisgestion_back.sigestion_back.model.dto.PresidenteRequestDTO;
import com.sisgestion_back.sigestion_back.model.dto.PresidenteResponseDTO;
import com.sisgestion_back.sigestion_back.model.entity.Comision;
import com.sisgestion_back.sigestion_back.model.entity.Presidente;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class PresidenteMapper {
    private final ModelMapper modelMapper;

    public Presidente convertToEntity(PresidenteRequestDTO presidenteRequestDTO) {
        return modelMapper.map(presidenteRequestDTO, Presidente.class);
    }

    public PresidenteResponseDTO convertToDTO(Presidente presidente) {
        return modelMapper.map(presidente, PresidenteResponseDTO.class);
    }

    public List<PresidenteResponseDTO> convertToDTO(List<Presidente> presidentes) {

        return presidentes.stream()
                .map(this::convertToDTO)
                .toList();
    }

}
