package com.sbep.SBEP.Controller;

import com.sbep.SBEP.DTOs.CamereDTO;
import com.sbep.SBEP.Entity.Birouri;
import com.sbep.SBEP.Entity.Camere;
import com.sbep.SBEP.Repository.CamereRepository;
import com.sbep.SBEP.Repository.CladiriRepository;
import com.sbep.SBEP.Service.CamereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/v1/camere")
@PreAuthorize("hasRole('ADMIN')")
public class CamereController {

    @Autowired
    private CamereService camereService;

    /*public CamereController(CamereService camereService)
    {
        this.camereService = camereService;
    }*/

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<CamereDTO>> getAllCamere() {
        List<CamereDTO> camere = camereService.findAll();
        return ResponseEntity.ok(camere);
    }

    @PostMapping("/post")
    public ResponseEntity<?> createCamera(@RequestBody CamereDTO camera) {
        Camere createdCamera = camereService.createCamera(camera);
        return ResponseEntity.ok("Camera created successfully");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteCamere(@PathVariable Long id) {
        Camere camera = camereService.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Camera not found for this id :: " + id));
        camereService.deleteCamere(id);
        return ResponseEntity.ok("Camera stearsa");
        //return ResponseEntity.ok().build();
    }

}
