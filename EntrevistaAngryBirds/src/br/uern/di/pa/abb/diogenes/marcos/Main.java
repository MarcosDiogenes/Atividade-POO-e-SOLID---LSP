package br.uern.di.pa.abb.diogenes.marcos;

import br.uern.di.pa.abb.diogenes.marcos.Ave;
import br.uern.di.pa.abb.diogenes.marcos.Passaro;
import br.uern.di.pa.abb.diogenes.marcos.Papagaio;
import br.uern.di.pa.abb.diogenes.marcos.Currupio;

public class Main {
    public static void main(String[] args) {

        Passaro papagaio = new Papagaio(200);

        System.out.println(papagaio.voar(300));

        papagaio.cantar();

        Passaro currupio = new Currupio(300);

        System.out.println(currupio.voar(400));

        currupio.cantar();

    }
}
