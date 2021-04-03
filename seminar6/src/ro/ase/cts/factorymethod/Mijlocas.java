package ro.ase.cts.factorymethod;

public class Mijlocas extends Jucator{
    public Mijlocas(String nume, int meciuriJucate) {
        super(nume, meciuriJucate);
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("Mijlocas{");
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }
}
