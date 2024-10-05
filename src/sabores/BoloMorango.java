package sabores;
import interfaces.Bolinho;

public class BoloMorango implements Bolinho {
    @Override
    public void preparar() {
        System.out.println("Hum bolo de morango...");
    }
}
