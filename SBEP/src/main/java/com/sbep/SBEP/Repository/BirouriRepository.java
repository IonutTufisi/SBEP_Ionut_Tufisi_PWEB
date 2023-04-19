package com.sbep.SBEP.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbep.SBEP.Entity.Birouri;

@Repository
public interface BirouriRepository extends JpaRepository<Birouri, Long> {

}