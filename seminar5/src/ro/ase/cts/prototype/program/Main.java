package ro.ase.cts.prototype.program;

import ro.ase.cts.prototype.clase.AbstractProtoype;
import ro.ase.cts.prototype.clase.Bilet;
import ro.ase.cts.prototype.clase.ClientStadion;

public class Main {
    public static void main(String[] args) {
        AbstractProtoype abstractProtoype = new ClientStadion("Alexandra",21);
        AbstractProtoype abstractProtoype2 = abstractProtoype.copiaza();
        ClientStadion clientStadion = (ClientStadion) abstractProtoype.copiaza();
        clientStadion.setDenumire("DenumireSchimbata");
        System.out.println(abstractProtoype.toString());
        System.out.println(abstractProtoype2.toString());
        System.out.println(clientStadion.toString());

        Bilet bilet = new Bilet(1,"echipa1","echipa2","27 martie, 10:00");
        Bilet bilet2 = (Bilet) bilet.copiaza();
        bilet2.setCod(10);
        System.out.println(bilet.toString());
        System.out.println(bilet2.toString());
    }
}
