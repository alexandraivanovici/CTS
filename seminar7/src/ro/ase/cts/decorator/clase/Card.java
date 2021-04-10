package ro.ase.cts.decorator.clase;

public class Card implements CardAbstract {
    private String titular;
    private String numarCard;

    public Card(String titular, String numarCard) {
        this.titular = titular;
        this.numarCard = numarCard;
    }

    @Override
    public void platesteOnline() {
        System.out.println("S-a platit online");
    }

    @Override
    public void platestePOS() {
        System.out.println("S-a platit POS");
    }


    public String getNumeTitular() {
        return titular;
    }
}
