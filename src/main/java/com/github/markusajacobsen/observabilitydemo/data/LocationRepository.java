package com.github.markusajacobsen.observabilitydemo.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<LocationEntity, Long> {
    
}