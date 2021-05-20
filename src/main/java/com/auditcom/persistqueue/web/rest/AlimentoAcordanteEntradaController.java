package com.auditcom.persistqueue.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auditcom.persistqueue.domain.AlimentoAcordanteEntrada;
import com.auditcom.persistqueue.domain.JuncaoEntidades;
import com.auditcom.persistqueue.service.AlimentoAcordanteEntradaService;

@RestController
@RequestMapping("/persist/entry/")
public class AlimentoAcordanteEntradaController {

	@Autowired
	private AlimentoAcordanteEntradaService alimentoAcordanteEntradaService;

	@GetMapping("get")
	public ResponseEntity<JuncaoEntidades> get() {
		return ResponseEntity.ok(alimentoAcordanteEntradaService.getAll());
	}

	@PostMapping("add")
	public ResponseEntity<AlimentoAcordanteEntrada> add(
			@RequestBody AlimentoAcordanteEntrada alimentoAcordanteEntrada) {
		return ResponseEntity.ok(alimentoAcordanteEntradaService.add(alimentoAcordanteEntrada));
	}
}
