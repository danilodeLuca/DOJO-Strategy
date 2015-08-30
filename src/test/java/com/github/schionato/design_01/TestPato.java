package com.github.schionato.design_01;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.github.schionato.design_01.pato.Pato;

public class TestPato {

	@Test
	public void verificaNadar() {
		Pato pato = new PatoDuble();
		assertFalse(pato.estaNadando());
		
		pato.nadar();
		assertTrue(pato.estaNadando());
	}
	
	@Test
	public void verificaPararDeNadar() {
		Pato pato = new PatoDuble();
		
		pato.nadar();
		assertTrue(pato.estaNadando());
		
		pato.pararNadar();
		assertFalse(pato.estaNadando());
	}

}
