package ro.ase.cts.flyweight.clase;

public class Client implements FlyweightAbstract{
    private String nume;
    private int nrTelefon;
    private String email;

    public Client(String nume, int nrTelefon, String email) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", nrTelefon=" + nrTelefon +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public void printeazaInfoRezervare(Rezervare rezervare) {
        System.out.println(rezervare.toString() + this.toString());
    }
}
