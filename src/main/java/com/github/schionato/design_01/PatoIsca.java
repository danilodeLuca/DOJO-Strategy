package com.github.schionato.design_01;

public class PatoIsca extends Pato {

	@Override
	public String quack() {
		return Quack.SILENCIO.getSom();
	}

	@Override
	public String show() {
		return null;
	}

}
