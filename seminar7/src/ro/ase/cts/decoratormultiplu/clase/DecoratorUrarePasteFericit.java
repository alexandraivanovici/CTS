package ro.ase.cts.decoratormultiplu.clase;

public class DecoratorUrarePasteFericit extends DecoratorAbstract{
    public DecoratorUrarePasteFericit(IOperatorBilet bilet) {
        super(bilet);
    }

    @Override
    public void rezervaBilet() {
        super.rezervaBilet();
        System.out.println("Paste Fericit si hai la meci!");
    }
}
