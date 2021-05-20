package com.auditcom.persistqueue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auditcom.persistqueue.domain.AlimentoAcordanteEntrada;

@Repository
public interface AlimentoAcordanteEntradaRepository extends JpaRepository<AlimentoAcordanteEntrada, Long> {

}
