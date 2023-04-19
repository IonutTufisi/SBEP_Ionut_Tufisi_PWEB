package com.sbep.SBEP.Repository;

import com.sbep.SBEP.DTOs.CamereDTO;
import com.sbep.SBEP.Entity.Camere;
import com.sbep.SBEP.Entity.Cladiri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CamereRepository extends JpaRepository<Camere, Long> {

}
