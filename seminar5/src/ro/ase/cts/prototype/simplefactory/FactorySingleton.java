package ro.ase.cts.prototype.simplefactory;

public class FactorySingleton {


    private static FactorySingleton factorySingleton= null;

    public FactorySingleton() {
    }

    public static synchronized FactorySingleton getInsrance(){
        if(factorySingleton == null){
            factorySingleton = new FactorySingleton();
        }
        return factorySingleton;
    }

    public Jucator getJucator(TipJucator tipJuccator, String nume, int varsta){
        switch (tipJuccator) {
            case PORTAR: return new Portar(nume,varsta);
            case FUNDAS: return new Fundas(nume, varsta);
            case ATACANT: return new Atacant(nume,varsta);
            default: throw new IllegalArgumentException();
        }
    }

}
