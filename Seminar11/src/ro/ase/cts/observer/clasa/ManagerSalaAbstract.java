package ro.ase.cts.observer.clasa;

import java.util.ArrayList;
import java.util.List;

public abstract class ManagerSalaAbstract {
    List<Observer> listaClientAbonati;

    public ManagerSalaAbstract() {
        this.listaClientAbonati = new ArrayList<>();
    }

    public void aboneaza(Observer observer){
        listaClientAbonati.add(observer);
    }

    public void dezaboneaza(Observer observer){
        listaClientAbonati.remove(observer);
    }

    public void notifica(String mesaj){
        for(Observer observer: listaClientAbonati){
            observer.primesteAnunt(mesaj);
        }
    }
}
