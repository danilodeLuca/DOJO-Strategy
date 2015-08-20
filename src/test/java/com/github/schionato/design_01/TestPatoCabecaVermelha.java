package com.github.schionato.design_01;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestPatoCabecaVermelha {

	@Test
	public void verificaExibicao() {
		Pato pato = new PatoCabecaVermelha();
		String exibicao = pato.show();
		
		assertEquals("exibindo um pato de cabeca vermelha!!", exibicao);
	}
	
}
