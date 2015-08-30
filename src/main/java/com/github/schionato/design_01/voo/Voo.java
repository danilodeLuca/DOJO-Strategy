package com.github.schionato.design_01.voo;

public enum Voo implements ComportamentoVoo {
    
    ALTO, BAIXO, NAO_VOA;

    @Override
    public String voar() {
        return this.name().toLowerCase();
    }

    @Override
    public boolean isVoando() {
        return false;
    }
}
