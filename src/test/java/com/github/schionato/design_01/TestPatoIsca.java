package com.github.schionato.design_01;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.github.schionato.design_01.pato.Pato;
import com.github.schionato.design_01.pato.PatoIsca;
import com.github.schionato.design_01.quack.Quack;

public class TestPatoIsca {

	@Test
	public void verificaExibicao() {
		Pato pato = new PatoIsca();
		assertNull(pato.show());
	}
	
	@Test
	public void quack() {
		Pato pato = new PatoIsca();
		assertEquals(Quack.SILENCIO.name().toLowerCase(), pato.quack());
	}
	
}
