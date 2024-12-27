package strategy;

import model.Dessin;
import model.Figure;

public class TraitementConcret2 implements TraitementStrategy {
    @Override
    public void traiter(Dessin dessin) {
        System.out.println("TraitementConcret2 : Calcul des périmètres de toutes les figures.");
//        for (Figure figure : dessin.getFigures()) {
//            System.out.println("Périmètre de la figure : " + figure.perimetre());
//        }
    }
}
