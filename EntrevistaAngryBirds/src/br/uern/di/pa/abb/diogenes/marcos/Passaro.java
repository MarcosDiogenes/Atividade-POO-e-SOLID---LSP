package br.uern.di.pa.abb.diogenes.marcos;

import br.uern.di.pa.abb.diogenes.marcos.Ave;

public abstract class Passaro implements Ave {

    public int voar() {

        return 0;
    }

    public void cantar() {

    }

    private int distancia_voo;

    public Passaro(int distancia_voo) {
        this.distancia_voo = distancia_voo;
    }

    public int getDistancia_voo() {
        return distancia_voo;
    }

    public void setDistancia_voo(int distancia_voo) {
        this.distancia_voo = distancia_voo;
    }
}