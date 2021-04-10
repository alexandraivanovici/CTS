package ro.ase.cts.decoratormultiplu.program;

import ro.ase.cts.decoratormultiplu.clase.Bilet;
import ro.ase.cts.decoratormultiplu.clase.DecoratorAbstract;
import ro.ase.cts.decoratormultiplu.clase.DecoratorSustinereEchipa;
import ro.ase.cts.decoratormultiplu.clase.DecoratorUrarePasteFericit;

public class Main {

    public static void main(String[] args) {
        Bilet bilet = new Bilet("Steaua","Rapid");
        bilet.rezervaBilet();

        DecoratorAbstract meciInGhencea = new DecoratorSustinereEchipa(bilet);
        meciInGhencea.rezervaBilet();

        DecoratorAbstract meciDePaste = new DecoratorUrarePasteFericit(bilet);
        meciDePaste.rezervaBilet();

        DecoratorAbstract meciInGhenceaDePaste = new DecoratorSustinereEchipa(meciDePaste);
        System.out.println();
        meciInGhenceaDePaste.rezervaBilet();
    }
}
