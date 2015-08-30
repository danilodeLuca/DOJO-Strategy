package com.github.schionato.design_01;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestPatoBorracha {

	@Test
	public void quack() {
		Pato pato = new PatoBorracha();
		String quack = pato.quack();
		
		assertEquals(Quack.GUINCHAR.getSom(), quack);
	}
	
	@Test
	public void verificaExibicao() {
		PatoBorracha pato = new PatoBorracha();
		assertEquals("exibindo um pato de borracha", pato.show());
	}
}
