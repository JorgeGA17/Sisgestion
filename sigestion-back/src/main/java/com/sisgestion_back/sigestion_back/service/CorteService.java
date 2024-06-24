package com.sisgestion_back.sigestion_back.service;

import com.sisgestion_back.sigestion_back.mapper.CorteMapper;
import com.sisgestion_back.sigestion_back.model.dto.CorteRequestDTO;
import com.sisgestion_back.sigestion_back.model.dto.CorteResponseDTO;
import com.sisgestion_back.sigestion_back.model.entity.Corte;
import com.sisgestion_back.sigestion_back.repository.CorteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor

public class CorteService {

    private CorteRepository corteRepository;
    private CorteMapper corteMapper;

    @Transactional(readOnly = true)
    public List<CorteResponseDTO> getAllCortes() {
        List<Corte> cortes = corteRepository.findAll();
        return corteMapper.convertToDTO(cortes);
    }

    @Transactional(readOnly = true)
    public CorteResponseDTO getCorteById(Long cortePk) {
        Corte corte = corteRepository.findById(cortePk)
                .orElseThrow(()-> new RuntimeException("Corte no encontrada"+cortePk));
        return corteMapper.convertToDTO(corte);
    }

    @Transactional
    public CorteResponseDTO createCorte (CorteRequestDTO corteRequestDTO) {
        Corte corte = corteMapper.convertToEntity(corteRequestDTO);
        corteRepository.save(corte);
        return corteMapper.convertToDTO(corte);
    }

    @Transactional
    public  CorteResponseDTO updateCorte(Long cortePk, CorteRequestDTO corteRequestDTO) {
        Corte corte = corteRepository.findById(cortePk)
                .orElseThrow(()-> new RuntimeException("Corte no encontrada"+cortePk));
      corte.setCCodigo(corteRequestDTO.getCCodigo());
      corte.setXNombre(corteRequestDTO.getXNombre());
      corte.setXSlug(corteRequestDTO.getXSlug());
      corte.setXNombreCorto(corteRequestDTO.getXNombreCorto());
      corte.setNEstado(corteRequestDTO.getNEstado());
        corte=corteRepository.save(corte);
        return corteMapper.convertToDTO(corte);
    }

    @Transactional
    public void deleteCorte(Long cortePk) {
        corteRepository.deleteById(cortePk);}


}
