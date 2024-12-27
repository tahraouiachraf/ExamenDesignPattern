package utils;

import model.Dessin;

import java.io.*;

public class Serializer {

    public static void serialize(Dessin dessin, String path) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(dessin);
            System.out.println("Dessin sérialisé avec succès dans : " + path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Dessin deserialize(String path) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            return (Dessin) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
