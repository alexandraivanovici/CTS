package ro.ase.cts.prototype.simplefactory;

public class Atacant extends Jucator{
    public Atacant(String numeJucator, int varsta) {
        super(numeJucator, varsta);
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("Atacant{");
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }

}
