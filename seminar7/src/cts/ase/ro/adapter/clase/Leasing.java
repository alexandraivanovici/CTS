package cts.ase.ro.adapter.clase;

public class Leasing {
    private String numeClient;
    private float suma;

    public Leasing(String numeClient, float suma) {
        super();
        this.numeClient = numeClient;
        this.suma = suma;
    }

    void creeazaLeasing(){
        System.out.println(numeClient+" are un leasing de "+suma);
    }
}
