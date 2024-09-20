/*
 * TP0 Exercice 3
 * TDC - Groupe 1
 * Martin Rouanet
 * 20 Septembre 2024
 */
package tp0_exo.pkg3;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class TP0_Exo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner sc;
sc = new Scanner(System.in);
System.out.println("Please enter the operateur : \n" + "1) add\n" + "2) substract\n" + "3) multiply\n" + "4) divide\n" + "5) modulo");

// Ajout de la ligne pour récupérer l'opérateur
int operateur = sc.nextInt();
System.out.println("Vous avez choisi l'operation : " + operateur);

// Ajout des lignes pour demander et récupérer la première valeur
System.out.println("Please enter the first value (operande1) :");
double operande1 = sc.nextDouble();
System.out.println("La premiere valeur saisie (operande1) est : " + operande1);

// Ajout des lignes pour demander et récupérer la deuxième valeur
System.out.println("Please enter the second value (operande2) :");
double operande2 = sc.nextDouble();
System.out.println("La seconde valeur saisie (operande2) est : " + operande2);

        // Calculer le résultat
        double resultat = 0;

        if (operateur == 1) {
            resultat = operande1 + operande2;  // Addition
        } else if (operateur == 2) {
            resultat = operande1 - operande2;  // Soustraction
        } else if (operateur == 3) {
            resultat = operande1 * operande2;  // Multiplication
        } else if (operateur == 4) {
            if (operande2 != 0) {
                resultat = operande1 / operande2;  // Division
            } else {
                System.out.println("Erreur : Division par zéro.");
                return;
            }
        } else if (operateur == 5) {
            if (operande2 != 0) {
                resultat = operande1 % operande2;  // Modulo
            } else {
                System.out.println("Erreur : Division par zéro.");
                return;
            }
        } else {
            System.out.println("Erreur : Opérateur non valide.");
            return;
        }

        // Afficher le résultat
        System.out.println("The result is : " + resultat);
    }
    
}
