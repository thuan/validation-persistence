package com.auditcom.persistqueue.domain;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class AlimentoAcordanteEntrada implements java.io.Serializable {

    static final long serialVersionUID = 1L;

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

    private String categoria;

    private String cst;

    private String normaExecucao;

    public AlimentoAcordanteEntrada(int crt, double percentualICMS) {
        this.crt = crt;
        this.percentualICMS = percentualICMS;
    }

    public AlimentoAcordanteEntrada(String ufEmitente, String ufDestinatario) {
        this.ufEmitente = ufEmitente;
        this.ufDestinatario = ufDestinatario;
    }

    public AlimentoAcordanteEntrada(int crt, double percentualICMS, String ufEmitente, String ufDestinatario, double valorItem, double valorIPI, double valorFrete, double valorSeguro, double valorOutros, int cfop, String cnpjEmitente, String cnpjDestinatario, String categoria, String cst, String normaExecucao) {
        this.crt = crt;
        this.percentualICMS = percentualICMS;
        this.ufEmitente = ufEmitente;
        this.ufDestinatario = ufDestinatario;
        this.valorItem = valorItem;
        this.valorIPI = valorIPI;
        this.valorFrete = valorFrete;
        this.valorSeguro = valorSeguro;
        this.valorOutros = valorOutros;
        this.cfop = cfop;
        this.cnpjEmitente = cnpjEmitente;
        this.cnpjDestinatario = cnpjDestinatario;
        this.categoria = categoria;
        this.cst = cst;
        this.normaExecucao = normaExecucao;
    }

    public AlimentoAcordanteEntrada() {
    }

    public int getCrt() {
        return this.crt;
    }

    public void setCrt(int crt) {
        this.crt = crt;
    }

    public double getPercentualICMS() {
        return this.percentualICMS;
    }

    public void setPercentualICMS(double percentualICMS) {
        this.percentualICMS = percentualICMS;
    }

    public String getUfEmitente() {
        return this.ufEmitente;
    }

    public void setUfEmitente(String ufEmitente) {
        this.ufEmitente = ufEmitente;
    }

    public String getUfDestinatario() {
        return this.ufDestinatario;
    }

    public void setUfDestinatario(String ufDestinatario) {
        this.ufDestinatario = ufDestinatario;
    }

    public double getValorItem() {
        return this.valorItem;
    }

    public void setValorItem(double valorItem) {
        this.valorItem = valorItem;
    }

    public double getValorIPI() {
        return this.valorIPI;
    }

    public void setValorIPI(double valorIPI) {
        this.valorIPI = valorIPI;
    }

    public double getValorFrete() {
        return this.valorFrete;
    }

    public void setValorFrete(double valorFrete) {
        this.valorFrete = valorFrete;
    }

    public double getValorSeguro() {
        return this.valorSeguro;
    }

    public void setValorSeguro(double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    public double getValorOutros() {
        return this.valorOutros;
    }

    public void setValorOutros(double valorOutros) {
        this.valorOutros = valorOutros;
    }

    public int getCfop() {
        return this.cfop;
    }

    public void setCfop(int cfop) {
        this.cfop = cfop;
    }

    public String getCnpjEmitente() {
        return this.cnpjEmitente;
    }

    public void setCnpjEmitente(String cnpjEmitente) {
        this.cnpjEmitente = cnpjEmitente;
    }

    public String getCnpjDestinatario() {
        return this.cnpjDestinatario;
    }

    public void setCnpjDestinatario(String cnpjDestinatario) {
        this.cnpjDestinatario = cnpjDestinatario;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCst() {
        return cst;
    }

    public void setCst(String cst) {
        this.cst = cst;
    }

    public String getNormaExecucao() {
        return normaExecucao;
    }

    public void setNormaExecucao(String normaExecucao) {
        this.normaExecucao = normaExecucao;
    }
}