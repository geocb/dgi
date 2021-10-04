package com.dgi.centralseguros.repository;

import com.dgi.centralseguros.entity.Seguro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeguroRepository extends JpaRepository<Seguro, Integer> {
}
