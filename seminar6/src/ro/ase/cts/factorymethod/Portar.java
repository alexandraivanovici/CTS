package ro.ase.cts.factorymethod;

public class Portar extends Jucator{
    public Portar(String nume, int meciuriJucate) {
        super(nume, meciuriJucate);
    }


    public String toString() {
        final StringBuilder sb = new StringBuilder("Portar{");
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }
}
