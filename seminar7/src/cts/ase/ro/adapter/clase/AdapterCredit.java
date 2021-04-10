package cts.ase.ro.adapter.clase;

public class AdapterCredit implements CreditAbstract{

    private Leasing leasing;

    public AdapterCredit(Leasing leasing){
        this.leasing = leasing;
    }

    @Override
    public void oferaCredit() {
        leasing.creeazaLeasing();
    }
}
