package com.sbep.SBEP.Service;

import com.sbep.SBEP.DTOs.BirouriDTO;
import com.sbep.SBEP.DTOs.CamereDTO;
import com.sbep.SBEP.Entity.Birouri;
import com.sbep.SBEP.Entity.Camere;
import com.sbep.SBEP.Repository.BirouriRepository;
import com.sbep.SBEP.Repository.CamereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BirouriService {

    @Autowired
    private BirouriRepository birouriRepository;

    public Birouri createBirou(BirouriDTO birouriDTO) {
        Birouri birouri = new Birouri();
        birouri.setId_birou(birouriDTO.getId_birou());
        birouri.setDenumire(birouriDTO.getDenumire());
        birouri.setPret(birouriDTO.getPret());
        return birouriRepository.save(birouri);
    }

    public List<BirouriDTO> findAll() {
        List<Birouri> birouri = birouriRepository.findAll();
        List<BirouriDTO> birouriDTOs = new ArrayList<>();
        for (Birouri birou : birouri) {
            BirouriDTO birouriDTO = new BirouriDTO(birou.getId_birou(), birou.getDenumire(), birou.getPret());
            birouriDTOs.add(birouriDTO);
        }
        return birouriDTOs;
    }
}
