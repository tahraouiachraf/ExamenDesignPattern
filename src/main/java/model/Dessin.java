package model;

import strategy.TraitementStrategy;

import java.util.ArrayList;
import java.util.List;

public class Dessin {
    private List<Figure> figures = new ArrayList<>();
    private TraitementStrategy strategie;

    public void ajouterFigure(Figure figure) {
        figures.add(figure);
    }

    public void supprimerFigure(Figure figure) {
        figures.remove(figure);
    }

    public void dessinerFigures() {
        for (Figure figure : figures) {
            figure.dessiner();
        }
    }

    public void setStrategie(TraitementStrategy strategie) {
        this.strategie = strategie;
    }

    public void traiter() {
        if (strategie != null) {
            strategie.traiter(this);
        } else {
            System.out.println("Aucune stratégie définie.");
        }
    }

    // Ajouter un getter pour la liste de figures
    public List<Figure> getFigures() {
        return figures;
    }
}
