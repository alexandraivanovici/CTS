package ro.ase.cts.factorymethod;

public class Fundas extends Jucator{
    public Fundas(String nume, int meciuriJucate) {
        super(nume, meciuriJucate);
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("Fundas{");
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }

}
