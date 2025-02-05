package com.componentes.Tarjetas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.componentes.Tarjetas.Entity.EstadoTrans;

@Repository
public interface EstadoTransRepository extends JpaRepository<EstadoTrans, Long> {
}