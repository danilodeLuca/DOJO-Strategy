package com.github.schionato.design_01;

public class PatoCabecaVermelha extends Pato implements Voador{

	@Override
	public String quack() {
		return Quack.GRASNAR.getSom();
	}

	@Override
	public String show() {
		return "exibindo um pato de cabeca vermelha!!";
	}
	
	@Override
	public Voo tipoVoo() {
		return Voo.BAIXO;
	}

	@Override
	public void voar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isVoando() {
		// TODO Auto-generated method stub
		return false;
	}

}
