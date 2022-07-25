package br.uern.di.pa.abb.diogenes.marcos;

public class Papagaio extends Passaro {

    @Override
    public void cantar() {
        System.out.println("Papagaio Legal");
    }

    @Override
    public int voar(int distancia) {

        if (distancia > this.getDistancia_voo()){
            return this.getDistancia_voo();
        }else{
            return distancia;
        }
    }

    public Papagaio(int distancia_voo) {
        super(distancia_voo);
    }
}
