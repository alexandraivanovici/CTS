package ro.ase.cts.chainofresponsaibility.clase;

public class ContCurent extends Cont{

    public ContCurent(float sold) {
        super(sold);
    }

    @Override
    public void realizaeazaPlata(float suma) {
        if(suma < super.getSold()){
            System.out.println("Plata a fost efectuata din contul curent pentru suma de "+ suma);
            super.setSold(super.getSold()-suma);
        } else if(super.getCont() != null){
            super.getCont().realizaeazaPlata(suma);
        } else {
            System.out.println("Plata a fost refuzata");
        }
    }
}
