package com.sisgestion_back.sigestion_back.service;

import com.sisgestion_back.sigestion_back.mapper.JerarquiaMapper;
import com.sisgestion_back.sigestion_back.model.dto.JerarquiaRequestDTO;
import com.sisgestion_back.sigestion_back.model.dto.JerarquiaResponseDTO;
import com.sisgestion_back.sigestion_back.model.entity.Jerarquia;

import com.sisgestion_back.sigestion_back.repository.JerarquiaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class JerarquiaService {

    private JerarquiaRepository jerarquiaRepository;
    private JerarquiaMapper jerarquiaMapper;

    @Transactional(readOnly = true)
    public List<JerarquiaResponseDTO> getAllJerarquias() {
        List<Jerarquia> jerarquias = jerarquiaRepository.findAll();
        return jerarquiaMapper.convertToDTO(jerarquias);
    }

    @Transactional(readOnly = true)
    public JerarquiaResponseDTO getJerarquiaById(Long jerarquiaPk) {
        Jerarquia jerarquia = jerarquiaRepository.findById(jerarquiaPk)
                .orElseThrow(()-> new RuntimeException("Jerarquia no encontrada"+jerarquiaPk));
        return jerarquiaMapper.convertToDTO(jerarquia);
    }

    @Transactional
    public JerarquiaResponseDTO createJerarquia (JerarquiaRequestDTO jerarquiaRequestDTO) {
        Jerarquia jerarquia = jerarquiaMapper.convertToEntity(jerarquiaRequestDTO);
        jerarquiaRepository.save(jerarquia);
        return jerarquiaMapper.convertToDTO(jerarquia);
    }

    @Transactional
    public  JerarquiaResponseDTO updateJerarquia (Long jerarquiaPk, JerarquiaRequestDTO jerarquiaRequestDTO) {
        Jerarquia jerarquia = jerarquiaRepository.findById(jerarquiaPk)
                .orElseThrow(()-> new RuntimeException("Jerarquia no encontrada"+ jerarquiaPk));
        jerarquia.setXNombre(jerarquiaRequestDTO.getXNombre());
        jerarquia=jerarquiaRepository.save(jerarquia);
        return jerarquiaMapper.convertToDTO(jerarquia);
    }

    @Transactional
    public void deleteJerarquia(Long jerarquiaPk) {
        jerarquiaRepository.deleteById(jerarquiaPk);}

}
