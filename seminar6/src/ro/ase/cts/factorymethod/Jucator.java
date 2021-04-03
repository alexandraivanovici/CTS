package ro.ase.cts.factorymethod;

public class Jucator {
    private String nume;
    private int meciuriJucate;

    public Jucator(String nume, int meciuriJucate) {
        this.nume = nume;
        this.meciuriJucate = meciuriJucate;
    }

    @Override
    public String toString() {
        return "Jucator{" +
                "nume='" + nume + '\'' +
                ", meciuriJucate=" + meciuriJucate +
                '}';
    }
}
