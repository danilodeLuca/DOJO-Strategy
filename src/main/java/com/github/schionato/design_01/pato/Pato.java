package com.github.schionato.design_01.pato;

import com.github.schionato.design_01.quack.ComportamentoQuack;
import com.github.schionato.design_01.voo.ComportamentoVoo;

public abstract class Pato {

    private boolean nadando = false;

    private ComportamentoVoo comportamentoVoo;
    private ComportamentoQuack comportamentoQuack;

    public Pato(ComportamentoQuack quack, ComportamentoVoo voo) {
        this.comportamentoQuack = quack;
        this.comportamentoVoo = voo;
    }

    public abstract String show();

    public String voar() {
        return this.comportamentoVoo.voar();
    }

    public String quack() {
        return comportamentoQuack.quack();
    }

    public void nadar() {
        nadando = true;
    }

    public void pararNadar() {
        nadando = false;
    }

    public boolean estaNadando() {
        return nadando;
    }

}
