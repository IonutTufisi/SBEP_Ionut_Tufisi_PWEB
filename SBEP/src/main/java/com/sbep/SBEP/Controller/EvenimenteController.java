package com.sbep.SBEP.Controller;

import com.sbep.SBEP.Repository.BirouriRepository;
import com.sbep.SBEP.Repository.EvenimenteRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/evenimente")
@PreAuthorize("hasAnyRole('ADMIN','USER')")
public class EvenimenteController {

    private final EvenimenteRepository evenimenteRepository;

    public EvenimenteController(EvenimenteRepository evenimenteRepository)
    {
        this.evenimenteRepository = evenimenteRepository;
    }

    @GetMapping
    public ResponseEntity getAllevenimente()
    {
        return ResponseEntity.ok(this.evenimenteRepository.findAll());
    }
}
