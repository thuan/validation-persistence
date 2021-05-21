package com.auditcom.persistqueue.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auditcom.persistqueue.domain.AlimentoAcordanteEntrada;
import com.auditcom.persistqueue.repository.AlimentoAcordanteEntradaRepository;

@Service
public class AlimentoAcordanteEntradaService {

	@Autowired
	private AlimentoAcordanteEntradaRepository alimentoAcordanteEntradaRepository;

	public AlimentoAcordanteEntrada add(AlimentoAcordanteEntrada alimentoAcordanteEntrada) {
		alimentoAcordanteEntrada.setDataCriacao(LocalDateTime.now());
		return alimentoAcordanteEntradaRepository.save(alimentoAcordanteEntrada);
	}

	public List<AlimentoAcordanteEntrada> getAll() {
		return alimentoAcordanteEntradaRepository.findAll();
	}
}
