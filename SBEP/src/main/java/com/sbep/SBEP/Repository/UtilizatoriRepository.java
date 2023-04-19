package com.sbep.SBEP.Repository;

import com.sbep.SBEP.Entity.Utilizatori;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UtilizatoriRepository extends JpaRepository<Utilizatori, Long> {

    Optional<Utilizatori> findByEmail(String email);
}
