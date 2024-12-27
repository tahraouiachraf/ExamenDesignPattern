package model;

public class Rectangle extends Figure {
    private Point coinSuperieurGauche;
    private double largeur;
    private double hauteur;

    public Rectangle(Point coinSuperieurGauche, double largeur, double hauteur, int epaisseur, String couleurContour, String couleurRemplissage) {
        super(epaisseur, couleurContour, couleurRemplissage);
        this.coinSuperieurGauche = coinSuperieurGauche;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public double perimetre() {
        return 2 * (largeur + hauteur);
    }

    @Override
    public double surface() {
        return largeur * hauteur;
    }

    @Override
    public void dessiner() {
        System.out.println("Rectangle : Coin=" + coinSuperieurGauche + ", Largeur=" + largeur + ", Hauteur=" + hauteur);
    }
}
