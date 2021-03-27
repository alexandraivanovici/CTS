package ro.ase.cts.prototype.clase;

public class Bilet implements AbstractProtoype{
    private int cod;
    private String numeEchipa1;
    private String numeEchipa2;
    private String dataSiOra;

    public Bilet(int cod, String numeEchipa1, String numeEchipa2, String dataSiOra) {
        super();
        this.cod = cod;
        this.numeEchipa1 = numeEchipa1;
        this.numeEchipa2 = numeEchipa2;
        this.dataSiOra = dataSiOra;
    }

    private Bilet() {
        super();
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    @Override
    public AbstractProtoype copiaza() {
        Bilet copie = new Bilet();
        copie.cod = this.cod;
        copie.numeEchipa1 = this.numeEchipa1;
        copie.numeEchipa2 = this.numeEchipa2;
        copie.dataSiOra = this.dataSiOra;
        return copie;
    }

    @Override
    public String toString() {
        return "Bilet{" +
                "cod=" + cod +
                ", numeEchipa1='" + numeEchipa1 + '\'' +
                ", numeEchipa2='" + numeEchipa2 + '\'' +
                ", dataSiOra='" + dataSiOra + '\'' +
                '}';
    }
}
