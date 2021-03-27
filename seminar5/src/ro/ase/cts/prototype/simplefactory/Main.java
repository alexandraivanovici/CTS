package ro.ase.cts.prototype.simplefactory;

public class Main {

    public static void main(String[] args) {
        FactorySingleton factory = new FactorySingleton().getInsrance();
        Jucator portar = factory.getJucator(TipJucator.PORTAR, "portar", 25);
        Jucator fundas = factory.getJucator(TipJucator.FUNDAS, "fundas", 25);
        System.out.println(portar.toString());
        System.out.println(fundas.toString());
    }
}
