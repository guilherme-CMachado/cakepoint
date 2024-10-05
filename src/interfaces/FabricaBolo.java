package interfaces;

public abstract class FabricaBolo {
    protected abstract Bolinho criarBolo();

    public void fazerBolo() {
        Bolinho bolo = criarBolo();
        bolo.preparar();
    }
}
