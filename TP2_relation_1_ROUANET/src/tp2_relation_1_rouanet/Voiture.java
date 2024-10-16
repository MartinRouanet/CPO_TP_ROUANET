/*
 * TP2 Exercice 4
 * TDC - Groupe 1
 * Martin Rouanet
 * 11 Octobre 2024
 */
package tp2_relation_1_rouanet;

/**
 *
 * @author marti
 */
public class Voiture {
    
    private String modele;
    private String marque;
    private int annee;
    private Personne proprietaire; // Ajout de l'attribut proprietaire

    // Constructeur
    public Voiture(String modele, String marque, int annee, Personne proprietaire) {
        this.modele = modele;
        this.marque = marque;
        this.annee = annee;
        this.proprietaire = proprietaire; // Initialisation du proprietaire
    }

    // Getter pour proprietaire
    public Personne getProprietaire() {
        return proprietaire;
    }

    // Setter pour proprietaire
    public void setProprietaire(Personne proprietaire) {
        this.proprietaire = proprietaire;
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Voiture [Modele: " + modele + ", Marque: " + marque + ", Annee: " + annee + ", Proprietaire: " + (proprietaire != null ? proprietaire.toString() : "Aucun") + "]";
    }
}