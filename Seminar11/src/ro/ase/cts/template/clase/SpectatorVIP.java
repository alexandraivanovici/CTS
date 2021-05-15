package ro.ase.cts.template.clase;

public class SpectatorVIP extends SpectatorAbstract{

    private String nume;
    private String loja;

    public SpectatorVIP(String nume, String loja) {
        this.nume = nume;
        this.loja = loja;
    }

    @Override
    public void asezareCoada() {
        System.out.println(this.nume+ " intra pe intrarea VIP");
    }

    @Override
    public void prezintaBilet() {
        System.out.println(this.nume+ " a prezentat biletul VIP");
    }

    @Override
    public void realizeazaControlCorporal() {
        System.out.println(this.nume+ " a fost controlat corporal");
    }

    @Override
    public void ocupaLoc() {
        System.out.println(this.nume+ " a ocuapt loc in loja " + this.loja);
    }
}
