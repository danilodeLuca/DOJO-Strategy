package com.github.schionato.design_01;

public abstract class Pato {

	private boolean nadando = false;

	public abstract String show();

	public String quack() {
		return "quack";
	}

	public void nadar() {
		if (!nadando)
			nadando = true;
	}

	public void pararNadar() {
		if (nadando)
			nadando = false;
	}

	public boolean estaNadando() {
		return nadando;
	}
}
