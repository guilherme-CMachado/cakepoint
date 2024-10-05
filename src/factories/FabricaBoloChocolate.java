package factories;

import interfaces.Bolinho;
import interfaces.FabricaBolo;
import sabores.BoloChocolate;

public class FabricaBoloChocolate extends FabricaBolo {

    @Override
    protected Bolinho criarBolo() {
        return new BoloChocolate();
    }

}
