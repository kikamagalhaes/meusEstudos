package com.web.ioc.ioc.domain.repository;

import com.web.ioc.ioc.domain.model.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaRepository  extends JpaRepository<Sala,Long> {
    
}
