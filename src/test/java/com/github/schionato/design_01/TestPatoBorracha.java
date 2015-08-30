package com.github.schionato.design_01;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.github.schionato.design_01.pato.Pato;
import com.github.schionato.design_01.pato.PatoBorracha;
import com.github.schionato.design_01.quack.Quack;

public class TestPatoBorracha {

	@Test
	public void quack() {
		Pato pato = new PatoBorracha();
		String quack = pato.quack();
		
		assertEquals(Quack.GUINCHAR.name().toLowerCase(), quack);
	}
	
	@Test
	public void verificaExibicao() {
		PatoBorracha pato = new PatoBorracha();
		assertEquals("exibindo um pato de borracha", pato.show());
	}
}
