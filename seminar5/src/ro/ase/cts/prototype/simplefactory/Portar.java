package ro.ase.cts.prototype.simplefactory;

public class Portar extends Jucator{

    public Portar(String numeJucator, int varsta) {
        super(numeJucator, varsta);
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("Portar{");
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }

}
