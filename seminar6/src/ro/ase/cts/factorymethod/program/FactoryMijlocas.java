package ro.ase.cts.factorymethod.program;

import ro.ase.cts.factorymethod.AbstractFactory;
import ro.ase.cts.factorymethod.Jucator;
import ro.ase.cts.factorymethod.Mijlocas;

public class FactoryMijlocas implements AbstractFactory {
    @Override
    public Jucator getJucator(String nume, int meciuriJucate) {
        return new Mijlocas(nume, meciuriJucate);
    }
}
