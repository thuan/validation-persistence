package com.auditcom.persistqueue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auditcom.persistqueue.domain.ResultadoAlimentoAcordanteEntrada;

@Repository
public interface IResultadoAlimentoAcordanteEntradaRepository
		extends JpaRepository<ResultadoAlimentoAcordanteEntrada, Long> {
}
