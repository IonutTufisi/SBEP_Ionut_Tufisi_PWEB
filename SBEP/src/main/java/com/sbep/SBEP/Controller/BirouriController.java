package com.sbep.SBEP.Controller;

import com.sbep.SBEP.DTOs.BirouriDTO;
import com.sbep.SBEP.DTOs.CamereDTO;
import com.sbep.SBEP.Service.BirouriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RestController;

import com.sbep.SBEP.Repository.BirouriRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@RestController
@RequestMapping("/api/v1/birouri")
@PreAuthorize("hasAnyRole('ADMIN','USER')")
public class BirouriController {

    @Autowired
    private BirouriService birouriService;

   /* public BirouriController(BirouriRepository birouriRepository)
    {
        this.birouriRepository = birouriRepository;
    }*/

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<BirouriDTO>> getAllBirouri() {
        List<BirouriDTO> birouri = birouriService.findAll();
        return ResponseEntity.ok(birouri);
    }


}
