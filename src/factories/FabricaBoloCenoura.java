package factories;

import interfaces.Bolinho;
import interfaces.FabricaBolo;
import sabores.BoloCenoura;;

public class FabricaBoloCenoura extends FabricaBolo {

    @Override
    protected Bolinho criarBolo() {
        return new BoloCenoura();
    }

}
