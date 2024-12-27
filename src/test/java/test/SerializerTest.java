package test;

import model.Dessin;
import model.Rectangle;
import model.Point;
import org.junit.jupiter.api.Test;
import utils.Serializer;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SerializerTest {

    @Test
    public void testSerialization() throws IOException, ClassNotFoundException {
        Dessin dessin = new Dessin();
        dessin.ajouterFigure(new Rectangle(new Point(0, 0), 10, 20));

        Serializer.serialize(dessin, "dessin.bin");
        Dessin loadedDessin = (Dessin) Serializer.deserialize("dessin.bin");

        assertNotNull(loadedDessin);
    }
}