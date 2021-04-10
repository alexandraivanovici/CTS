package ro.ase.cts.decorator.clase;

import ro.ase.cts.adapter.clase.CreditAbstract;

public abstract class DecoratorAbstract implements CardAbstract {
    private CardAbstract cardAbstract;
    public DecoratorAbstract(CardAbstract cardAbstract){
        super();
        this.cardAbstract=cardAbstract;
    }

    public CardAbstract getCardAbstract() {
        return cardAbstract;
    }

    @Override
    public void platestePOS() {
        cardAbstract.platestePOS();
    }

    @Override
    public void platesteOnline() {
        cardAbstract.platesteOnline();
    }
    public void platesteContactless(){
        System.out.println("S-a platit Contacltess");
    };

}