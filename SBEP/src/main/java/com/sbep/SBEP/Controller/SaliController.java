package com.sbep.SBEP.Controller;

import com.sbep.SBEP.Entity.Cladiri;
import com.sbep.SBEP.Entity.Evenimente;
import com.sbep.SBEP.Entity.Sali;
import com.sbep.SBEP.Repository.SaliRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/api/v1/sali")
@PreAuthorize("hasAnyRole('ADMIN','USER')")
public class SaliController {

    @Autowired
    private SaliRepository saliRepository;

    public SaliController(SaliRepository saliRepository)
    {
        this.saliRepository = saliRepository;
    }

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity getAllsali()
    {
        return ResponseEntity.ok(this.saliRepository.findAll());
    }

    /*@GetMapping("/{salaId}")
    public ResponseEntity<Sali> getaSaliWithEvenimente(@PathVariable Long salaId) {
        Sali sala = saliRepository.findAllWithEvenimente(salaId);
        if (sala == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(sala);
    }*/

    @GetMapping("/{salaId}/evenimente")
    public Set<Evenimente> getEvenimenteBySalaId(@PathVariable Long salaId) {
        Sali sala = saliRepository.findById(salaId)
                .orElseThrow(() -> new ResourceNotFoundException("Sala not found with id " + salaId));
        return sala.getEvenimente();
    }
}
