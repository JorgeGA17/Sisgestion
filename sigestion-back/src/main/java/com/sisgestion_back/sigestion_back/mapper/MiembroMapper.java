package com.sisgestion_back.sigestion_back.mapper;

import com.sisgestion_back.sigestion_back.model.dto.MiembroRequestDTO;
import com.sisgestion_back.sigestion_back.model.dto.MiembroResponseDTO;
import com.sisgestion_back.sigestion_back.model.entity.Miembro;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.modelmapper.ModelMapper;

import java.util.List;

@AllArgsConstructor
@Component
public class MiembroMapper {

    private final ModelMapper modelMapper;

    public Miembro convertToEntity(MiembroRequestDTO miembroRequestDTO) {
        return modelMapper.map(miembroRequestDTO, Miembro.class);
    }

    public MiembroResponseDTO convertToDTO(Miembro miembro) {
        return modelMapper.map(miembro, MiembroResponseDTO.class);
    }

    public List<MiembroResponseDTO> convertToDTO(List<Miembro> miembros) {
        return miembros.stream()
                .map(this::convertToDTO)
                .toList();
    }
}
