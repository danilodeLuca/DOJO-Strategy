package com.github.schionato.design_01.pato;

import com.github.schionato.design_01.quack.Quack;
import com.github.schionato.design_01.voo.Voo;

public class PatoSelvagem extends Pato {

    public PatoSelvagem() {
        super(Quack.GRASNAR, Voo.ALTO);
    }

    @Override
    public String show() {
        return "exibindo um pato muito bravo!!";
    }

}
