package com.github.schionato.design_01;

public class PatoSelvagem extends Pato implements Voador{

	@Override
	public String quack() {
		return Quack.GRASNAR.getSom();
	}

	@Override
	public String show() {
		return "exibindo um pato muito bravo!!";
	}

	@Override
	public Voo tipoVoo() {
		return Voo.ALTO;
	}

	@Override
	public void voar() {
	}

	@Override
	public boolean isVoando() {
		return false;
	}

}
