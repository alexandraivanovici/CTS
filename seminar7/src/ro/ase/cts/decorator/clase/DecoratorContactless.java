package ro.ase.cts.decorator.clase;

import ro.ase.cts.adapter.clase.CreditAbstract;

public class DecoratorContactless extends DecoratorAbstract{

    public DecoratorContactless(CardAbstract cardAbstract) {
        super(cardAbstract);
    }

    @Override
    public void platesteContactless() {
        System.out.println(((Card)super.getCardAbstract()).getNumeTitular()+" a platit Contactless");
    }
}
