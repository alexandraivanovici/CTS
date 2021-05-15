package ro.ase.cts.observer.clasa;

import java.util.List;

public class ManagerSala extends ManagerSalaAbstract{

    private String denumireSala;

    public ManagerSala(String denumireSala) {
        this.denumireSala = denumireSala;
    }

    public void anuntaMeci(String tipMeci) {
        super.notifica("Va avea loc un meci de " +tipMeci+ " in sala " +denumireSala);
    }

}
