package com.auditcom.persistqueue.domain;

import java.util.List;

public class JuncaoEntidades {

	private List<AlimentoAcordanteEntrada> alimentoAcordanteEntrada;
	private List<ResultadoAlimentoAcordanteEntrada> resultadoAlimentoAcordanteEntrada;

	public List<AlimentoAcordanteEntrada> getAlimentoAcordanteEntrada() {
		return alimentoAcordanteEntrada;
	}

	public void setAlimentoAcordanteEntrada(List<AlimentoAcordanteEntrada> alimentoAcordanteEntrada) {
		this.alimentoAcordanteEntrada = alimentoAcordanteEntrada;
	}

	public List<ResultadoAlimentoAcordanteEntrada> getResultadoAlimentoAcordanteEntrada() {
		return resultadoAlimentoAcordanteEntrada;
	}

	public void setResultadoAlimentoAcordanteEntrada(
			List<ResultadoAlimentoAcordanteEntrada> resultadoAlimentoAcordanteEntrada) {
		this.resultadoAlimentoAcordanteEntrada = resultadoAlimentoAcordanteEntrada;
	}

}
