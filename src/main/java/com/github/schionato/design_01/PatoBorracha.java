package com.github.schionato.design_01;

public class PatoBorracha extends Pato {

	@Override
	public String quack() {
		return Quack.GUINCHAR.getSom();
	}

	@Override
	public String show() {
		return "exibindo um pato de borracha";
	}
}
