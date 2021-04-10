package ro.ase.cts.adapter.program;

import ro.ase.cts.adapter.clase.AdapterCredit;
import ro.ase.cts.adapter.clase.AdapterCreditClasa;
import ro.ase.cts.adapter.clase.CreditAbstract;
import ro.ase.cts.adapter.clase.Leasing;

public class Main {

    public static void createCredit(CreditAbstract credit){
        credit.oferaCredit();
    }

    public static  void main(String[] args){
        Leasing leasing = new Leasing("Alexandra",100);
        AdapterCredit adapterCredit = new AdapterCredit(leasing);
        createCredit(adapterCredit);

        AdapterCreditClasa adapterCreditClasa = new AdapterCreditClasa("Alexandra", 6000);
        createCredit(adapterCreditClasa);
    }
}
