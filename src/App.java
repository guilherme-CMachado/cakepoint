import factories.FabricaBoloAbacaxi;
import factories.FabricaBoloCenoura;
import factories.FabricaBoloChocolate;
import factories.FabricaBoloMorango;
import interfaces.FabricaBolo;

public class App {
    public static void main(String[] args) throws Exception {
        FabricaBolo fabricaChocolate = new FabricaBoloChocolate();
        FabricaBolo fabricaMorango = new FabricaBoloMorango();
        FabricaBolo fabricaCenoura = new FabricaBoloCenoura();
        FabricaBolo fabricaAbacaxi = new FabricaBoloAbacaxi();

        fabricaChocolate.fazerBolo();
        fabricaMorango.fazerBolo();
        fabricaCenoura.fazerBolo();
        fabricaAbacaxi.fazerBolo();
    }
}
