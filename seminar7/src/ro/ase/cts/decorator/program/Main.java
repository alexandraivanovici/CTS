package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.Card;
import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.DecoratorContactless;

public class Main {

    public static void main(String[] args){
        Card card = new Card("Tommy","123456789");
        card.platesteOnline();
        card.platestePOS();
        DecoratorAbstract decoratorAbstract = new DecoratorContactless(card);
        decoratorAbstract.platesteContactless();
        decoratorAbstract.platesteOnline();
        decoratorAbstract.platestePOS();
        DecoratorAbstract decoratorAbstract1 = new DecoratorContactless(card);
        decoratorAbstract1.platesteContactless();
        decoratorAbstract1.platesteOnline();
        decoratorAbstract1.platestePOS();

        DecoratorAbstract decoratorAbstract2 = new DecoratorContactless(decoratorAbstract1);

    }
}
