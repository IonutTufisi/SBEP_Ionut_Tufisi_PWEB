package com.sbep.SBEP.Service;

import com.sbep.SBEP.DTOs.CamereDTO;
import com.sbep.SBEP.Entity.Birouri;
import com.sbep.SBEP.Entity.Camere;
import com.sbep.SBEP.Repository.CamereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CamereService {

    @Autowired
    private CamereRepository camereRepository;

    public Camere createCamera(CamereDTO camereDTO) {
        Camere camere = new Camere();
        camere.setId_camera(camereDTO.getId_camera());
        camere.setLatime(camereDTO.getLatime());
        camere.setLungime(camereDTO.getLungime());
        camere.setInaltime(camereDTO.getInaltime());
        return camereRepository.save(camere);
    }

    public void deleteCamere(Long id) {
        camereRepository.deleteById(id);
        //return ResponseEntity.ok().build();
    }

    public Optional<Camere> findById(Long id) {
        return camereRepository.findById(id);
    }

    public List<CamereDTO> findAll() {
        List<Camere> camere = camereRepository.findAll();
        List<CamereDTO> camereDTOs = new ArrayList<>();
        for (Camere camera : camere) {
            CamereDTO camereDTO = new CamereDTO(camera.getId_camera(), camera.getInaltime(), camera.getLatime(), camera.getLungime());
            camereDTOs.add(camereDTO);
        }
        return camereDTOs;
    }

}
