package com.github.schionato.design_01.quack;

public enum Quack implements ComportamentoQuack {
    
    GRASNAR, GUINCHAR, SILENCIO;

    @Override
    public String quack() {
        return this.name().toLowerCase();
    }

}
