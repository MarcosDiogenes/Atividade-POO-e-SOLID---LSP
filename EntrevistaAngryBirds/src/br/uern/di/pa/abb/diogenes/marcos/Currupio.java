package br.uern.di.pa.abb.diogenes.marcos;

public class Currupio extends Passaro {

    @Override
    public void cantar() {
        System.out.println("Pio frio fru fri Pió");
    }

    @Override
    public int voar(int distancia) {
        if (distancia > this.getDistancia_voo()){
            return this.getDistancia_voo();
        }else{
            return distancia;
        }
    }

    public Currupio(int distancia_voo) {
        super(distancia_voo);
    }
}
