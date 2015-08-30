package com.github.schionato.design_01;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.github.schionato.design_01.pato.Pato;
import com.github.schionato.design_01.pato.PatoCabecaVermelha;
import com.github.schionato.design_01.quack.Quack;
import com.github.schionato.design_01.voo.Voo;

public class TestPatoCabecaVermelha {

	@Test
	public void verificaExibicao() {
		Pato pato = new PatoCabecaVermelha();
		String exibicao = pato.show();
		
		assertEquals("exibindo um pato de cabeca vermelha!!", exibicao);
	}
	
	@Test
	public void quack() {
		Pato pato = new PatoCabecaVermelha();
		String quack = pato.quack();
		
		assertEquals(Quack.GRASNAR.name().toLowerCase(), quack);
	}
	
	@Test
	public void comoEstaVoando() {
		PatoCabecaVermelha pato = new PatoCabecaVermelha();
		assertEquals(Voo.BAIXO.name().toLowerCase(), pato.voar());
	}
	
}
