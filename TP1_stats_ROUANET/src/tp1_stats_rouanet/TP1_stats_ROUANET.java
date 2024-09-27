/*
 * TP1 Exercice 4
 * TDC - Groupe 1
 * Martin Rouanet
 * 27 Septembre 2024
 */
package tp1_stats_rouanet;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author marti
 */
public class TP1_stats_ROUANET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Création d'un générateur de nombres aléatoires
        Random generateurAleat = new Random();
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir un nombre entier m
        System.out.print("Veuillez saisir un nombre entier m : ");
        int m = scanner.nextInt(); // Lire le nombre entier saisi par l'utilisateur

        // Création et initialisation du tableau avec 6 entiers
        int[] facesDe = new int[6]; // Toutes les cases sont initialisées à 0 par défaut

        // Boucle de m itérations pour tirer des nombres aléatoires
        for (int i = 0; i < m; i++) {
            // Tirer un nombre aléatoire entre 0 et 5
            int nombreAleatoire = generateurAleat.nextInt(6); // Inclusif de 0 à 5

            // Incrémenter la case d'indice correspondant
            facesDe[nombreAleatoire]++;
        }

        // Affichage des résultats sous forme de pourcentages
        System.out.println("Resultats des tirages (en pourcentage) :");
        for (int i = 0; i < facesDe.length; i++) {
            double pourcentage = (facesDe[i] / (double) m) * 100; // Calculer le pourcentage
            System.out.printf("Face %d : %.2f%%\n", (i + 1), pourcentage); // Affichage formaté
        }

        // Fermeture du scanner
        scanner.close();
    }
}