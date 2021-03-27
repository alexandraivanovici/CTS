package ro.ase.cts.prototype.clase;

public class ClientStadion implements AbstractProtoype{
    private String denumire;
    private int varsta;

    private ClientStadion() {
        super();
    }

    public ClientStadion(String denumire, int varsta) {
        super();
        //validari
        this.denumire = denumire;
        this.varsta = varsta;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "ClientStadion{" +
                "denumire='" + denumire + '\'' +
                ", varsta=" + varsta +
                '}';
    }

    @Override
    public AbstractProtoype copiaza() {
        ClientStadion clona = new ClientStadion();
        clona.denumire = this.denumire;
        clona.varsta = this.varsta;
        return clona;

    }
}
