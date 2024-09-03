package com.projetoTestHospede.entity;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HospedeTest {
	
	private Hospede hospede;
	
	@BeforeEach
	void setUp() {
		hospede = new Hospede(1L, "Neymar", "Neymarjr@gmail", "(00)0000-0000");
	}

	@Test
	@DisplayName("Testando o getter e setter do campo ID")
	void testId() {
		hospede.setId(2L);
		//Assert
		assertEquals(2L, hospede.getId());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo nome")
	void testNome() {
		hospede.setNome("Messi");
		assertEquals("Messi", hospede.getNome());
}
	@Test
	@DisplayName("Testando o getter e setter do campo email")
	void testEmail() {
		hospede.setEmail("Messi@gmail.com");
		assertEquals("Messi@gmail.com", hospede.getEmail());
}
	@Test
	@DisplayName("Testando o getter e setter do campo telefone")
	void testTelefone() {
		hospede.setTelefone("(00)1111-1111");
		assertEquals("(00)1111-1111", hospede.getTelefone());
}
	@Test
	@DisplayName("Testando o construtor com todos os argumentos")
	void testConstrutorAll() {
		Hospede novoHospede = new Hospede(3L, "Matheus", "matheus@gmail.com", "(15)2222-2222");
		assertAll("novoHospede",
				()-> assertEquals(3L, novoHospede.getId()),
				()-> assertEquals("Matheus", novoHospede.getNome()),
				()-> assertEquals("matheus@gmail.com", novoHospede.getEmail()),
				()-> assertEquals("(15)2222-2222", novoHospede.getTelefone()));
	}
}
