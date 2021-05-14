package com.auditcom.persistqueue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auditcom.persistqueue.domain.ResultadoAlimentoAcordanteEntrada;
import com.auditcom.persistqueue.repository.IResultadoAlimentoAcordanteEntradaRepository;

@Service
public class ResultadoAlimentoAcordanteEntradaService {

	@Autowired
	private IResultadoAlimentoAcordanteEntradaRepository resultadoAlimentoAcordanteEntradaRepository;

	public ResultadoAlimentoAcordanteEntrada add(ResultadoAlimentoAcordanteEntrada resultadoAlimentoAcordanteEntrada) {
		resultadoAlimentoAcordanteEntradaRepository.save(resultadoAlimentoAcordanteEntrada);
		return resultadoAlimentoAcordanteEntrada;
	}

	public List<ResultadoAlimentoAcordanteEntrada> getAll() {
		return resultadoAlimentoAcordanteEntradaRepository.findAll();
	}
}
