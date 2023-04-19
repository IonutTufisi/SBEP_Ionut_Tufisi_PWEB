package com.sbep.SBEP.Controller;

import com.sbep.SBEP.DTOs.CamereDTO;
import com.sbep.SBEP.DTOs.CladiriDTO;
import com.sbep.SBEP.Entity.Cladiri;
import com.sbep.SBEP.Repository.BirouriRepository;
import com.sbep.SBEP.Repository.CladiriRepository;
import com.sbep.SBEP.Service.CladiriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cladiri")
@PreAuthorize("hasAnyRole('ADMIN','USER')")
public class CladiriController {

    @Autowired
    private CladiriService cladiriService;

    @Autowired
    private CladiriRepository cladiriRepository;

   /* public CladiriController(CladiriService cladiriService)
    {
        this.cladiriService = cladiriService;
    }*/

    @GetMapping
    public ResponseEntity<List<CladiriDTO>> getAllCladiri() {
        List<CladiriDTO> cladiri = cladiriService.findAll();
        return ResponseEntity.ok(cladiri);
    }

    @GetMapping("/{cladireId}")
    public ResponseEntity<Cladiri> getCladireWithCamera(@PathVariable Long cladireId) {
        Cladiri cladire = cladiriRepository.findCladireWithCamera(cladireId);
        if (cladire == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(cladire);
    }

}
