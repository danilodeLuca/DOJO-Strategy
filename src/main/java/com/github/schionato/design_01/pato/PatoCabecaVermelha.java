package com.github.schionato.design_01.pato;

import com.github.schionato.design_01.quack.Quack;
import com.github.schionato.design_01.voo.Voo;

public class PatoCabecaVermelha extends Pato {

    public PatoCabecaVermelha() {
        super(Quack.GRASNAR, Voo.BAIXO);
    }

    @Override
    public String show() {
        return "exibindo um pato de cabeca vermelha!!";
    }

}
