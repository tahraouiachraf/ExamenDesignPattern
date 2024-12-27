import model.Cercle;
import model.Point;

public class Main {
    public static void main(String[] args) {
        // Create a Point for the center of the circle
        Point centre = new Point(10, 20);  // (x, y) coordinates for the center

        // Define the radius, thickness, outline color, and fill color
        double rayon = 5.0;
        int epaisseur = 2;  // Example thickness
        String couleurContour = "black";  // Example outline color
        String couleurRemplissage = "red";  // Example fill color

        // Create a Cercle object with the required parameters
        Cercle cercle = new Cercle(centre, rayon, epaisseur, couleurContour, couleurRemplissage);

        // Now you can use the methods of Cercle
        cercle.dessiner();
        System.out.println("Perimeter: " + cercle.perimetre());
        System.out.println("Area: " + cercle.surface());
    }
}
