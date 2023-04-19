package com.sbep.SBEP.Repository;

import com.sbep.SBEP.Entity.Birouri;
import com.sbep.SBEP.Entity.Cladiri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CladiriRepository extends JpaRepository<Cladiri, Long> {

    @Query(value = "SELECT * FROM cladiri c1 JOIN camere c2 ON c1.id = c2.idcladire WHERE c1.id = :cladireId", nativeQuery = true)
    Cladiri findCladireWithCamera(@Param("cladireId") Long cladireId);
}
