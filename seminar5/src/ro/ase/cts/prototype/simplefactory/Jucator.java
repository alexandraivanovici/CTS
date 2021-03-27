package ro.ase.cts.prototype.simplefactory;

public abstract class Jucator {
    private String numeJucator;
    private int varsta;

    public Jucator(String numeJucator, int varsta) {
        this.numeJucator = numeJucator;
        this.varsta = varsta;
    }

    public Jucator() {
    }

    public String getNumeJucator() {
        return numeJucator;
    }

    public void setNumeJucator(String numeJucator) {
        this.numeJucator = numeJucator;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "Jucator{" +
                "numeJucator='" + numeJucator + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
