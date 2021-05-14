package com.auditcom.persistqueue.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auditcom.persistqueue.domain.ResultadoAlimentoAcordanteEntrada;
import com.auditcom.persistqueue.service.ResultadoAlimentoAcordanteEntradaService;

@Service
public class ConsumerQueueExitComponent {
	public static final String QUEUE_EXIT = "queue_exit";

	@Autowired
	private ResultadoAlimentoAcordanteEntradaService resultadoAlimentoAcordanteEntradaService;

	@RabbitListener(queues = QUEUE_EXIT)
	public void consumirQueueEntry(ResultadoAlimentoAcordanteEntrada resultadoAlimentoAcordanteEntrada) {
		resultadoAlimentoAcordanteEntradaService.add(resultadoAlimentoAcordanteEntrada);
	}
}
