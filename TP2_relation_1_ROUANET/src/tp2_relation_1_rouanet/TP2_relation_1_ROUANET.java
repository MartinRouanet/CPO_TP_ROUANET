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
public class TP2_relation_1_ROUANET {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Création des objets Personne
        Personne bob = new Personne("Bobby", "Sixkiller", 30);
        Personne reno = new Personne("Reno", "Raines", 28);

        // Création des objets Voiture
        Voiture uneClio = new Voiture("Clio", "Renault", 5, null);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5, null);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6, null);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4, null);

        // Test de l'ajout des voitures à Bob
        bob.ajouterVoiture(uneClio);
        bob.ajouterVoiture(uneAutreClio);

        // Test de l'ajout des voitures à Reno
        reno.ajouterVoiture(une2008);
        reno.ajouterVoiture(uneMicra);

        // Affichage des voitures de Bob
        System.out.println("Les voitures de Bob : ");
        for (int i = 0; i < bob.getNbVoitures(); i++) {
            System.out.println(bob.getListeVoitures()[i]);
        }

        // Affichage des voitures de Reno
        System.out.println("Les voitures de Reno : ");
        for (int i = 0; i < reno.getNbVoitures(); i++) {
            System.out.println(reno.getListeVoitures()[i]);
        }
    }
}