/*
 * TP2 Exercice 2
 * TDC - Groupe 1
 * Martin Rouanet
 * 11 Octobre 2024
 */
package tp2_convertisseurobjet_rouanet;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class TP2_convertisseurObjet_ROUANET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Création d'un scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);

        // Création d'un objet Convertisseur
        Convertisseur convertisseur = new Convertisseur();

        while (true) {
            // Affichage du menu
            System.out.println("\n--- Menu de Conversion de Temperatures ---");
            System.out.println("1) De Celsius vers Kelvin");
            System.out.println("2) De Kelvin vers Celsius");
            System.out.println("3) De Fahrenheit vers Celsius");
            System.out.println("4) De Celsius vers Fahrenheit");
            System.out.println("5) De Kelvin vers Fahrenheit");
            System.out.println("6) De Fahrenheit vers Kelvin");
            System.out.println("7) Quitter");
            System.out.print("Choisissez une option (1-7): ");

            // Lecture du choix de l'utilisateur
            int choix = scanner.nextInt();

            // Vérification de l'option choisie
            if (choix == 7) {
                System.out.println("Merci d'avoir utilise le convertisseur !");
                break; // Sortir de la boucle et terminer le programme
            }

            // Demande à l'utilisateur de saisir une température
            System.out.print("Saisissez la temperature a convertir: ");
            double temperature = scanner.nextDouble();

            // Variable pour stocker le résultat de la conversion
            double resultat = 0.0;
            String uniteInitiale = "";
            String uniteFinale = "";

            // Switch pour gérer les conversions selon le choix de l'utilisateur
            switch (choix) {
                case 1:
                    resultat = convertisseur.CelciusVersKelvin(temperature);
                    uniteInitiale = "Celsius";
                    uniteFinale = "Kelvin";
                    break;
                case 2:
                    resultat = convertisseur.KelvinVersCelcius(temperature);
                    uniteInitiale = "Kelvin";
                    uniteFinale = "Celsius";
                    break;
                case 3:
                    resultat = convertisseur.FarenheitVersCelcius(temperature);
                    uniteInitiale = "Fahrenheit";
                    uniteFinale = "Celsius";
                    break;
                case 4:
                    resultat = convertisseur.CelciusVersFarenheit(temperature);
                    uniteInitiale = "Celsius";
                    uniteFinale = "Fahrenheit";
                    break;
                case 5:
                    resultat = convertisseur.KelvinVersFarenheit(temperature);
                    uniteInitiale = "Kelvin";
                    uniteFinale = "Fahrenheit";
                    break;
                case 6:
                    resultat = convertisseur.FarenheitVersKelvin(temperature);
                    uniteInitiale = "Fahrenheit";
                    uniteFinale = "Kelvin";
                    break;
                default:
                    System.out.println("Choix non valide. Veuillez reessayer.");
                    continue; // Retourner au début de la boucle pour un nouveau choix
            }

            // Affichage du résultat de la conversion
            System.out.printf("%.2f degres %s est egal a %.2f degres %s.\n", temperature, uniteInitiale, resultat, uniteFinale);
            
            // Affichage du nombre total de conversions effectuées
            System.out.println("Nombre total de conversions effectuees: " + convertisseur);
            
            // Fin du programme après conversion
            break;
        }

        // Fermeture du scanner
        scanner.close();
    }
}
