package com.sbep.SBEP.Repository;

import com.sbep.SBEP.Entity.Sali;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface SaliRepository extends JpaRepository<Sali, Long> {

    @Query(value = "SELECT s.* FROM sali s " +
            "INNER JOIN sali_evenimente se ON s.id = se.id_sala " +
            "INNER JOIN evenimente e ON se.id_eveniment = e.id " +
            "WHERE s.id = :salaId", nativeQuery = true)
    Sali findAllWithEvenimente(@Param("salaId") Long salaId);

}
