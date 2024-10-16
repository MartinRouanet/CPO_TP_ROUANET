/*
 * TP2 Exercice 3
 * TDC - Groupe 1
 * Martin Rouanet
 * 11 Octobre 2024
 */
package tp2_manip_rouanet;

/**
 *
 * @author marti
 */
public class Tartiflette {
        // Attribut nbCalories de type int
    private int nbCalories;

    // Constructeur qui initialise nbCalories
    public Tartiflette(int nbCalories) {
        this.nbCalories = nbCalories;
    }

    // Méthode pour obtenir les calories
    public int getNbCalories() {
        return nbCalories;
    }

    // Méthode pour afficher les informations sur la Tartiflette
    @Override
    public String toString() {
        return "Tartiflette: " + nbCalories + " calories.";
    }
    public void increaseCalories(int calories) {
    this.nbCalories += calories;
}
}

