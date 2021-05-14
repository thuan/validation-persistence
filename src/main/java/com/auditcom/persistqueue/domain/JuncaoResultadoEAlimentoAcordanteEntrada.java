package com.auditcom.persistqueue.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;

@Builder
@Entity
@Table
public class JuncaoResultadoEAlimentoAcordanteEntrada implements Serializable {
	static final long serialVersionUID = 1L;

//	RESULTADO ALIMENTO ACORDANTE ENTRADA

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private double valorImposto;
	private double valorBaseDeCalculo;
	private Double percentualCargaLiquida;

	private boolean calcularImposto;
	private boolean simplesNacional;

	private String mensagem;
	private String regiaoEmitente;
	private String regiaoDestinatario;
	private String fluxo;
	private String tipoProduto;
	private String categoriaResultado;

//	 ALIMENTO ACORDANTE ENTRADA

	private int crt;
	private double percentualICMS;

	private String ufEmitente;
	private String ufDestinatario;

	private double valorItem;

	private double valorIPI;

	private double valorFrete;

	private double valorSeguro;

	private double valorOutros;

	private int cfop;

	private String cnpjEmitente;

	private String cnpjDestinatario;

	private String categoriaAlimento;

	private String cst;

	private String normaExecucao;
}
