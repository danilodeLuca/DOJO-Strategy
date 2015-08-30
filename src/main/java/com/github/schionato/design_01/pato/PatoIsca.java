package com.github.schionato.design_01.pato;

import com.github.schionato.design_01.quack.Quack;
import com.github.schionato.design_01.voo.Voo;

public class PatoIsca extends Pato {

    public PatoIsca() {
        super(Quack.SILENCIO, Voo.ALTO);
    }

    @Override
    public String show() {
        return null;
    }

}
