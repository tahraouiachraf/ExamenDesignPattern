package model;

import java.util.ArrayList;
import java.util.List;

public class GroupeFigures extends Figure {
    private List<Figure> figures;

    public GroupeFigures(int epaisseur, String couleurContour, String couleurRemplissage) {
        super(epaisseur, couleurContour, couleurRemplissage);
        this.figures = new ArrayList<>();
    }

    public void ajouterFigure(Figure figure) {
        figures.add(figure);
    }

    public void supprimerFigure(Figure figure) {
        figures.remove(figure);
    }

    @Override
    public double perimetre() {
        return figures.stream().mapToDouble(Figure::perimetre).sum();
    }

    @Override
    public double surface() {
        return figures.stream().mapToDouble(Figure::surface).sum();
    }

    @Override
    public void dessiner() {
        for (Figure figure : figures) {
            figure.dessiner();
        }
    }
}
