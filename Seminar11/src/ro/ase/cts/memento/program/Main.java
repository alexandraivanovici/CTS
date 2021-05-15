package ro.ase.cts.memento.program;

import ro.ase.cts.memento.clase.ManagerMeciuri;
import ro.ase.cts.memento.clase.Meci;
import ro.ase.cts.memento.clase.Memento;

public class Main {
    public static void main(String[] args) {

        Meci meci = new Meci(100,"FCSB","Dinamo",20,15);
        Memento memento = meci.creareMemento();
        ManagerMeciuri managerMeciuri = new ManagerMeciuri();
        managerMeciuri.adaugaMemento(memento);

        meci.setNrSpectatori(200);
        meci.setNumeEchipaGazda("Craiova");
        meci.setNumeEchipaOaspeti("CFR Cluj");
        managerMeciuri.adaugaMemento(meci.creareMemento());

        System.out.println(meci);
        meci.setMemento(managerMeciuri.getMemento(0));
        System.out.println(meci);
    }
}
