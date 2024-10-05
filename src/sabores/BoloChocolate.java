package sabores;
import interfaces.Bolinho;

public class BoloChocolate implements Bolinho {
    @Override
    public void preparar() {
        System.out.println("Bolo de chocolate >>");
    }
}
