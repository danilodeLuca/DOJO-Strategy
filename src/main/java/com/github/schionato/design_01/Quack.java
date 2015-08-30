package com.github.schionato.design_01;

public enum Quack {
	GRASNAR("grasnar"), GUINCHAR("guinchar"), SILENCIO("silencio");

	private String som;

	private Quack (String som) {
		this.som = som;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

}
