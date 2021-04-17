package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.Client;
import ro.ase.cts.flyweight.clase.FabricaClienti;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Main {

    public static void main(String[] args) {
        Rezervare rezervare1 = new Rezervare(100,3,10);
        Rezervare rezervare2 = new Rezervare(101,2,19);
        Rezervare rezervare3 = new Rezervare(102,4,20);

        FabricaClienti fabricaClienti = new FabricaClienti();

        Client client1 = fabricaClienti.getClient("client@gmail.com");
        client1.printeazaInfoRezervare(rezervare1);

        fabricaClienti.getClient("client2@gmail.com").printeazaInfoRezervare(rezervare2);

        fabricaClienti.getClient("client@gmail.com").printeazaInfoRezervare(rezervare3);
    }
}
