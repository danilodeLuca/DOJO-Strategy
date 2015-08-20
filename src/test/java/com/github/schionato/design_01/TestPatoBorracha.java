package com.github.schionato.design_01;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPatoBorracha {

	@Test
	public void quack() {
		Pato pato = new PatoBorracha();
		String quack = pato.quack();
		
		assertNull(quack);
	}
	
	@Test
	public void verificaExibicao() {
		PatoBorracha pato = new PatoBorracha();
		
		assertEquals("exibindo um pato de borracha", pato.show());
	}
}
