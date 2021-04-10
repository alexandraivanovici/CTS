package ro.ase.cts.decoratormultiplu.clase;

public class Bilet implements IOperatorBilet{
    private String numeEchipaGazda;
    private String numeEchipaOaspeti;

    public Bilet(String numeEchipaGazda, String numeEchipaOaspeti) {
        this.numeEchipaGazda = numeEchipaGazda;
        this.numeEchipaOaspeti = numeEchipaOaspeti;
    }

    @Override
    public void rezervaBilet() {
        System.out.println(numeEchipaGazda + " Joaca impotriva " + numeEchipaOaspeti);
    }

    @Override
    public String getNumeEchipaGazda() {
        return numeEchipaGazda;
    }

    @Override
    public String getNumeEchipaOaspteti() {
        return numeEchipaOaspeti;
    }
}
