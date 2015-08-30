package com.github.schionato.design_01.pato;

import com.github.schionato.design_01.quack.Quack;
import com.github.schionato.design_01.voo.Voo;

public class PatoBorracha extends Pato {

    public PatoBorracha() {
        super(Quack.GUINCHAR, Voo.NAO_VOA);
    }

	@Override
	public String show() {
		return "exibindo um pato de borracha";
	}
}
