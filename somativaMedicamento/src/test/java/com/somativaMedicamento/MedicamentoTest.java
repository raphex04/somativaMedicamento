package com.somativaMedicamento;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.somativaMedicamento.entity.Medicamento;

class MedicamentoTest {

private Medicamento medicamento;
	
	@BeforeEach
	void setUp() {
		medicamento = new Medicamento(1L, "Dipirona", "Remédio de dor de cabeça", "27/09/2026");
	}

	@Test
	@DisplayName("Testando o getter e setter do campo ID")
	void testId() {
		medicamento.setId(2L);
		//Assert
		assertEquals(2L, medicamento.getId());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo nome")
	void testNome() {
		medicamento.setNome("Dipirona");
		assertEquals("Dipirona", medicamento.getNome());
}
	@Test
	@DisplayName("Testando o getter e setter do campo bula")
	void testBula() {
		medicamento.setBula("Remédio para dor de cabeça");
		assertEquals("Remédio para dor de cabeça", medicamento.getBula());
}
	@Test
	@DisplayName("Testando o getter e setter do campo data de validade")
	void testDataValidade() {
		medicamento.setDataValidade("27/09/2026");
		assertEquals("27/09/2026", medicamento.getDataValidade());
}
	@Test
	@DisplayName("Testando o construtor com todos os argumentos")
	void testConstrutorAll() {
		Medicamento novoMedicamento = new Medicamento(3L, "Dipirona", "Remédio para dor de cabeça", "27/09/2026");
		assertAll("novoMedicamento",
				()-> assertEquals(3L, novoMedicamento.getId()),
				()-> assertEquals("Dipirona", novoMedicamento.getNome()),
				()-> assertEquals("Remédio para dor de cabeça", novoMedicamento.getBula()),
				()-> assertEquals("27/09/2026", novoMedicamento.getDataValidade()));
	}
}
