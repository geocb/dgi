package com.dgi.centralseguros.repository;

import com.dgi.centralseguros.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
