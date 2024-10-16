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
public class Moussaka {
        // Attribut nbCalories de type int
    int nbCalories;

    // Constructeur
    public Moussaka(int calories) {
        this.nbCalories = calories;
    }

    // Méthode pour obtenir les calories
    public int getNbCalories() {
        return nbCalories;
    }

    // Méthode pour afficher les informations sur la Moussaka
    @Override
    public String toString() {
        return "Moussaka: " + nbCalories + " calories.";
    }
}

