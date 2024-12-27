package model;

public abstract class Figure {
    protected int epaisseur;
    protected String couleurContour;
    protected String couleurRemplissage;

    public Figure(int epaisseur, String couleurContour, String couleurRemplissage) {
        this.epaisseur = epaisseur;
        this.couleurContour = couleurContour;
        this.couleurRemplissage = couleurRemplissage;
    }

    public abstract double perimetre();

    public abstract double surface();

    public abstract void dessiner();
}
