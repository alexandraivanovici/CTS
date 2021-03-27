package ro.ase.cts.prototype.simplefactory;

public class Factory {
    public Jucator getJucator(TipJucator tipJuccator, String nume, int varsta){
        switch (tipJuccator) {
            case PORTAR: return new Portar(nume,varsta);
            case FUNDAS: return new Fundas(nume, varsta);
            case ATACANT: return new Atacant(nume,varsta);
            default: throw new IllegalArgumentException();
        }
    }
}
