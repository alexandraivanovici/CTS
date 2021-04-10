package ro.ase.cts.adapter.program;

import cts.ase.ro.adapter.clase.AdapterCredit;
import cts.ase.ro.adapter.clase.AdapterCreditClasa;
import cts.ase.ro.adapter.clase.CreditAbstract;
import cts.ase.ro.adapter.clase.Leasing;

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
