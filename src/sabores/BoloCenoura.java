package sabores;

import interfaces.Bolinho;

public class BoloCenoura implements Bolinho {
    @Override
    public void preparar() {
        System.out.println("Bolo de cenoura tem gosto de infancia");
    }
}
