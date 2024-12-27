package strategy;

import model.Dessin;

public class TraitementConcret1 implements TraitementStrategy {
    @Override
    public void traiter(Dessin dessin) {
        System.out.println("Traitement 1 appliqué au dessin");
    }
}
