package com.sisgestion_back.sigestion_back.service;


import com.sisgestion_back.sigestion_back.mapper.ProyectoMapper;
import com.sisgestion_back.sigestion_back.model.dto.*;
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

@Service
@AllArgsConstructor

public class ProyectoService {

    @Autowired
    private ProyectoRepository proyectoRepository;
    private ProyectoMapper proyectoMapper;

    @Transactional(readOnly = true)
    public List<ProyectoResponseDTO> getAllProyectos() {
        List<Proyecto> proyectos = proyectoRepository.findAll();
        return proyectoMapper.convertToDTO(proyectos);
    }

    @Transactional(readOnly = true)
    public ProyectoResponseDTO getProyectoById(Long proyectopk) {
        Proyecto proyecto = proyectoRepository.findById(proyectopk)
                .orElseThrow(()-> new RuntimeException("Proyecto no encontrado"+proyectopk));
        return proyectoMapper.convertToDTO(proyecto);
    }


    @Transactional
    public ProyectoResponseDTO createProyecto (ProyectoRequestDTO proyectoRequestDTO) {
        Proyecto proyecto = proyectoMapper.convertToEntity(proyectoRequestDTO);
        proyectoRepository.save(proyecto);
        return proyectoMapper.convertToDTO(proyecto);
    }

    @Transactional
    public  ProyectoResponseDTO updateProyecto(Long proyectopk, ProyectoRequestDTO proyectoRequestDTO) {
        Proyecto proyecto = proyectoRepository.findById(proyectopk)
                .orElseThrow(()-> new RuntimeException("Proyecto no encontrado"+proyectopk));
        proyecto.setXnombreproyecto(proyectoRequestDTO.getXnombreproyecto());
        proyecto.setXslug(proyectoRequestDTO.getXslug());
        proyecto.setXproblematica(proyectoRequestDTO.getXproblematica());
        proyecto.setXresumen(proyectoRequestDTO.getXresumen());
        proyecto.setXobjetivogeneral(proyectoRequestDTO.getXobjetivogeneral());
        proyecto.setXinnovacion(proyectoRequestDTO.getXinnovacion());
        proyecto.setXimpacto(proyectoRequestDTO.getXimpacto());
        proyecto.setXsostenibilidad(proyectoRequestDTO.getXsostenibilidad());
        proyecto.setXreplicabilidad(proyectoRequestDTO.getXreplicabilidad());
        proyecto.setNpublicacion(proyectoRequestDTO.getNpublicacion());
        proyecto.setNpeso(proyectoRequestDTO.getNpeso());
        proyecto.setFfecha(proyectoRequestDTO.getFfecha());

        proyecto=proyectoRepository.save(proyecto);
        return proyectoMapper.convertToDTO(proyecto);
    }

    @Transactional
    public void deleteProyecto(Long proyectopk) {
        proyectoRepository.deleteById(proyectopk);}



}
