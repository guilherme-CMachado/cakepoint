package sabores;

import interfaces.Bolinho;

public class BoloAbacaxi implements Bolinho {
    @Override
    public void preparar() {
        System.out.println("Bolo de abacai!? Meh...");
    }
}
