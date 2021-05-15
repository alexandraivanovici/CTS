package ro.ase.cts.observer.program;

import ro.ase.cts.observer.clasa.ClientAbonat;
import ro.ase.cts.observer.clasa.ManagerSala;
import ro.ase.cts.observer.clasa.Observer;

public class Main {
    public static void main(String[] args) {
        ManagerSala managerSala = new ManagerSala("Sala Sporturilor");
        Observer clientAbonat1 = new ClientAbonat("Luciana");
        Observer clientAbonat2 = new ClientAbonat("Andrei");
        Observer clientAbonat3 = new ClientAbonat("Andrea");
        managerSala.aboneaza(clientAbonat1);
        managerSala.aboneaza(clientAbonat2);
        managerSala.aboneaza(clientAbonat3);

        managerSala.anuntaMeci("fotbal");

        managerSala.dezaboneaza(clientAbonat3);
        managerSala.anuntaMeci("volei");
    }
}
