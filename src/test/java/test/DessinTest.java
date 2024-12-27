package test;

import model.Cercle;
import model.Dessin;
import model.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DessinTest {

    @Test
    public void testAjouterFigure() {
        Dessin dessin = new Dessin();
        Cercle cercle = new Cercle(new Point(0, 0), 10);
        dessin.ajouterFigure(cercle);

        assertEquals(1, dessin.getFigures().size());
    }
}
