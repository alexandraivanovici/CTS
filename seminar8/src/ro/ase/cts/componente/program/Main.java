package ro.ase.cts.componente.program;

import ro.ase.cts.componente.clase.Item;
import ro.ase.cts.componente.clase.Sectiune;

public class Main {
    public static void main(String[] args) {

        Sectiune bauturi = new Sectiune("bauturi");
        Sectiune aperitive = new Sectiune("aperitive");

        Item cola= new Item("Cola");
        Item fanta= new Item("Fanta");

        Item bruschete= new Item("Bruschete");

        bauturi.adaugaComponenta(cola);
        bauturi.adaugaComponenta(fanta);
        aperitive.adaugaComponenta(bruschete);

        Sectiune meniu = new Sectiune("Meniu");
        meniu.adaugaComponenta(bauturi);
        meniu.adaugaComponenta(aperitive);

        meniu.afisareDescriere();
    }
}
