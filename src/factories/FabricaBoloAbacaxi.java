package factories;

import interfaces.Bolinho;
import interfaces.FabricaBolo;
import sabores.BoloAbacaxi;

public class FabricaBoloAbacaxi extends FabricaBolo {

    @Override
    protected Bolinho criarBolo() {
       return new BoloAbacaxi();
    }

}
