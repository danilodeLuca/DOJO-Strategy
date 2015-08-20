package com.github.schionato.design_01;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPatoIsca {

	@Test
	public void verificaExibicao() {
		Pato pato = new PatoIsca();
		assertNull(pato.show());
	}
	
	@Test
	public void quack() {
		Pato pato = new PatoIsca();
		assertNull(pato.quack());
	}
	
}
