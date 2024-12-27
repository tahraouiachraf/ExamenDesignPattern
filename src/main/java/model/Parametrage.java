package model;

import java.util.ArrayList;
import java.util.List;

public class Parametrage extends Observable {
    private int epaisseurContour;
    private String couleurContour;
    private String couleurRemplissage;

    public int getEpaisseurContour() {
        return epaisseurContour;
    }

    public void setEpaisseurContour(int epaisseurContour) {
        this.epaisseurContour = epaisseurContour;
        notifierObservateurs();
    }

    public String getCouleurContour() {
        return couleurContour;
    }

    public void setCouleurContour(String couleurContour) {
        this.couleurContour = couleurContour;
        notifierObservateurs();
    }

    public String getCouleurRemplissage() {
        return couleurRemplissage;
    }

    public void setCouleurRemplissage(String couleurRemplissage) {
        this.couleurRemplissage = couleurRemplissage;
        notifierObservateurs();
    }
}
