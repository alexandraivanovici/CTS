package ro.ase.cts.factorymethod.program;

import ro.ase.cts.factorymethod.*;

public class Main {

    private static void afisareInformatiiJucator(AbstractFactory abstractFactory, String nume, int meciuriJucate){
        Jucator jucator = abstractFactory.getJucator(nume, meciuriJucate);
        System.out.println(jucator.toString());
    }

    public static void main(String[] args){

        afisareInformatiiJucator(new FactoryAtacant(), "Ana",10);
        afisareInformatiiJucator(new FactoryPortar(),"Mihai",7);
        afisareInformatiiJucator(new FactoryFundas(), "Andrei",5);
        afisareInformatiiJucator(new FactoryMijlocas(),"Alex",3);

    }
}
