package com.auditcom.persistqueue.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auditcom.persistqueue.domain.ResultadoAlimentoAcordanteEntrada;
import com.auditcom.persistqueue.service.ResultadoAlimentoAcordanteEntradaService;

@RestController
@RequestMapping("/persist/")
public class ResultadoAlimentoAcordanteEntradaController {

	@Autowired
	private ResultadoAlimentoAcordanteEntradaService resultadoAlimentoAcordanteEntradaService;

	@GetMapping("get")
	public ResponseEntity<List<ResultadoAlimentoAcordanteEntrada>> get() {
		return ResponseEntity.ok(resultadoAlimentoAcordanteEntradaService.getAll());
	}
}
