package com.github.schionato.design_01;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestPatoSelvagem {

	@Test
	public void verificaExibicao() {
		Pato pato = new PatoSelvagem();
		String exibicao = pato.show();
		
		assertEquals("exibindo um pato muito bravo!!", exibicao);
	}
	
	@Test
	public void quack() {
		Pato pato = new PatoSelvagem();
		String quack = pato.quack();
		
		assertEquals(Quack.GRASNAR.getSom(), quack);
	}
	
	@Test
	public void comoEstaVoando() {
		PatoCabecaVermelha pato = new PatoCabecaVermelha();
		assertEquals(Voo.BAIXO, pato.tipoVoo());
	}
}
