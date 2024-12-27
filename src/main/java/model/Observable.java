package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    private List<Observer> observers = new ArrayList<>();

    public void ajouterObservateur(Observer observer) {
        observers.add(observer);
    }

    public void supprimerObservateur(Observer observer) {
        observers.remove(observer);
    }

    protected void notifierObservateurs() {
        for (Observer observer : observers) {
            observer.mettreAJour(this);
        }
    }
}
