package ro.ase.cts.state.clase;

public class Ocupata implements StareMasa{
    @Override
    public void modificaStare(Masa masa) {
        if(masa.getStareMasa() instanceof Rezervata) {
            masa.setStareMasa(this);
        }
        else {
            System.out.println("Masa nu poate fi ocupata");
        }
    }
}
