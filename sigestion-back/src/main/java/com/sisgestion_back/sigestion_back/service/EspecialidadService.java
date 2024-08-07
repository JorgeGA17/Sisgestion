package com.sisgestion_back.sigestion_back.service;


import com.sisgestion_back.sigestion_back.mapper.EspecialidadMapper;

import com.sisgestion_back.sigestion_back.model.dto.EspecialidadRequestDTO;
import com.sisgestion_back.sigestion_back.model.dto.EspecialidadResponseDTO;

import com.sisgestion_back.sigestion_back.model.dto.ProyectoResponseDTO;
import com.sisgestion_back.sigestion_back.model.entity.Especialidad;

import com.sisgestion_back.sigestion_back.model.entity.Proyecto;
import com.sisgestion_back.sigestion_back.repository.EspecialidadRepository;
import com.sisgestion_back.sigestion_back.repository.ProyectoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EspecialidadService {

    private EspecialidadRepository especialidadRepository;
    private EspecialidadMapper especialidadMapper;

    @Transactional(readOnly = true)
    public List<EspecialidadResponseDTO> getAllEspecialidades() {
        List<Especialidad> especialidades = especialidadRepository.findAll();
        return especialidadMapper.convertToDTO(especialidades);
    }

    @Transactional(readOnly = true)
    public EspecialidadResponseDTO getEspecialidadById(Long especialidadPk) {
        Especialidad especialidad = especialidadRepository.findById(especialidadPk)
                .orElseThrow(()-> new RuntimeException("Especialidad no encontrada"+especialidadPk));
        return especialidadMapper.convertToDTO(especialidad);
    }

    @Transactional
    public EspecialidadResponseDTO createEspecialidad (EspecialidadRequestDTO especialidadRequestDTO) {
        Especialidad especialidad = especialidadMapper.convertToEntity(especialidadRequestDTO);
        especialidadRepository.save(especialidad);
        return especialidadMapper.convertToDTO(especialidad);
    }

    @Transactional
    public  EspecialidadResponseDTO updateEspecialidad(Long especialidadPk, EspecialidadRequestDTO especialidadRequestDTO) {
        Especialidad especialidad = especialidadRepository.findById(especialidadPk)
                .orElseThrow(()-> new RuntimeException("Especialidad no encontrada"+ especialidadPk));
       especialidad.setXNombre(especialidadRequestDTO.getXNombre());
        especialidad=especialidadRepository.save(especialidad);
        return especialidadMapper.convertToDTO(especialidad);
    }

    @Transactional
    public void deleteEspecialidad(Long especialidadPk) {
        especialidadRepository.deleteById(especialidadPk);}


}