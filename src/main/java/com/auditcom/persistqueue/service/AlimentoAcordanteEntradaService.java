package com.auditcom.persistqueue.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auditcom.persistqueue.domain.AlimentoAcordanteEntrada;
import com.auditcom.persistqueue.domain.JuncaoEntidades;
import com.auditcom.persistqueue.repository.AlimentoAcordanteEntradaRepository;
import com.auditcom.persistqueue.repository.IResultadoAlimentoAcordanteEntradaRepository;

@Service
public class AlimentoAcordanteEntradaService {

	@Autowired
	private AlimentoAcordanteEntradaRepository alimentoAcordanteEntradaRepository;

	@Autowired
	private IResultadoAlimentoAcordanteEntradaRepository resultadoAlimentoAcordanteEntradaRepository;

	public AlimentoAcordanteEntrada add(AlimentoAcordanteEntrada alimentoAcordanteEntrada) {
		return alimentoAcordanteEntradaRepository.save(alimentoAcordanteEntrada);
	}

	public JuncaoEntidades getAll() {

		JuncaoEntidades juncaoEntidades = new JuncaoEntidades();
		juncaoEntidades.setAlimentoAcordanteEntrada(alimentoAcordanteEntradaRepository.findAll());

		juncaoEntidades.setResultadoAlimentoAcordanteEntrada(resultadoAlimentoAcordanteEntradaRepository.findAll());
		return juncaoEntidades;
	}
}
