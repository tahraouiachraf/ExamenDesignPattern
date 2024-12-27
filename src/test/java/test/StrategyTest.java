package test;

import model.Dessin;
import strategy.TraitementConcret1;
import strategy.TraitementConcret2;
import org.junit.jupiter.api.Test;

public class StrategyTest {

    @Test
    public void testChangerStrategy() {
        Dessin dessin = new Dessin();
        dessin.setStrategie(new TraitementConcret1());
        dessin.traiter();

        dessin.setStrategie(new TraitementConcret2());
        dessin.traiter();
    }
}
