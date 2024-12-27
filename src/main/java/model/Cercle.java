package model;

public class Cercle extends Figure {
    private Point centre;
    private double rayon;

    public Cercle(Point centre, double rayon, int epaisseur, String couleurContour, String couleurRemplissage) {
        super(epaisseur, couleurContour, couleurRemplissage);
        this.centre = centre;
        this.rayon = rayon;
    }

    @Override
    public double perimetre() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public double surface() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public void dessiner() {
        System.out.println("Cercle : Centre=" + centre + ", Rayon=" + rayon + ", Couleur=" + couleurRemplissage);
    }
}

