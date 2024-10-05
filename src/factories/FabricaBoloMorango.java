package factories;

import interfaces.Bolinho;
import interfaces.FabricaBolo;
import sabores.BoloMorango;

public class FabricaBoloMorango extends FabricaBolo {
    @Override
    protected Bolinho criarBolo() {
        return new BoloMorango();
    }
}
