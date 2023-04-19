package com.sbep.SBEP.Service;

import com.sbep.SBEP.DTOs.CamereDTO;
import com.sbep.SBEP.DTOs.CladiriDTO;
import com.sbep.SBEP.Entity.Camere;
import com.sbep.SBEP.Entity.Cladiri;
import com.sbep.SBEP.Repository.CamereRepository;
import com.sbep.SBEP.Repository.CladiriRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CladiriService {

    @Autowired
    private CladiriRepository cladiriRepository;

    public Cladiri createCladire(CladiriDTO cladiriDTO) {
        Cladiri cladiri = new Cladiri();
        cladiri.setId_cladire(cladiriDTO.getId_cladire());
        cladiri.setAdresa(cladiriDTO.getAdresa());
        cladiri.setDenumire(cladiriDTO.getDenumire());
        cladiri.setJudet(cladiriDTO.getJudet());
        cladiri.setLocalitate(cladiriDTO.getLocalitate());
        cladiri.setDescriere(cladiriDTO.getDescriere());
        return cladiriRepository.save(cladiri);
    }

    public void deleteCladiri(Long id) {
        cladiriRepository.deleteById(id);
    }

    public List<CladiriDTO> findAll() {
        List<Cladiri> cladiri = cladiriRepository.findAll();
        List<CladiriDTO> cladiriDTOs = new ArrayList<>();
        for (Cladiri cladire : cladiri) {
            CladiriDTO cladiriDTO = new CladiriDTO(cladire.getId_cladire(), cladire.getDenumire(), cladire.getAdresa(), cladire.getJudet(), cladire.getLocalitate(), cladire.getNr_camere(), cladire.getNr_etaje());
            cladiriDTOs.add(cladiriDTO);
        }
        return cladiriDTOs;
    }
}
