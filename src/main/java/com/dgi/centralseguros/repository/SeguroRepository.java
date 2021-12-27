package com.dgi.centralseguros.repository;

import com.dgi.centralseguros.entity.Seguro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeguroRepository extends JpaRepository<Seguro, Integer> {
    List<Seguro> findAllByCodCliente(Integer codCliente);
}
