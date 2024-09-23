/*
 * TP1 Exercice 2
 * TDC - Groupe 1
 * Martin Rouanet
 * 23 Septembre 2024
 */
package tp1_convertisseur_rouanet;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class TP1_convertisseur_ROUANET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Création d'un scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir une température en degrés Celsius
        System.out.print("Bonjour, saisissez une valeur : ");
        double temperature = scanner.nextDouble();
        
                System.out.println("Saisissez la conversion que vous souhaitez effectuer : ");
        System.out.println("1) De Celcius vers Kelvin");
        System.out.println("2) De Kelvin vers Celcius");
        System.out.println("3) De Fahrenheit vers Celcius");
        System.out.println("4) De Celcius vers Fahrenheit");
        System.out.println("5) De Kelvin vers Fahrenheit");
        System.out.println("6) De Fahrenheit vers Kelvin");
        
                // Lecture du choix de l'utilisateur
        int choix = scanner.nextInt();

        // Variable pour stocker le résultat de la conversion
        double resultat = 0.0;
        String uniteInitiale = "";
        String uniteFinale = "";
        
                // Switch pour gérer les conversions selon le choix de l'utilisateur
        switch (choix) {
            case 1:
                resultat = CelciusVersKelvin(temperature);
                uniteInitiale = "Celsius";
                uniteFinale = "Kelvin";
                break;
            case 2:
                resultat = KelvinVersCelcius(temperature);
                uniteInitiale = "Kelvin";
                uniteFinale = "Celsius";
                break;
            case 3:
                resultat = FarenheitVersCelcius(temperature);
                uniteInitiale = "Fahrenheit";
                uniteFinale = "Celsius";
                break;
            case 4:
                resultat = CelciusVersFarenheit(temperature);
                uniteInitiale = "Celsius";
                uniteFinale = "Fahrenheit";
                break;
            case 5:
                resultat = KelvinVersFarenheit(temperature);
                uniteInitiale = "Kelvin";
                uniteFinale = "Fahrenheit";
                break;
            case 6:
                resultat = FarenheitVersKelvin(temperature);
                uniteInitiale = "Fahrenheit";
                uniteFinale = "Kelvin";
                break;
            default:
                System.out.println("Choix non valide.");
                scanner.close();
                return;
        }
        
            // Affichage du résultat de la conversion
        System.out.println(temperature + " degres " + uniteInitiale + " est egal a " + resultat + " degres " + uniteFinale);

        // Fermeture du scanner
        scanner.close();
    }
    
    // Méthode pour convertir Celsius en Kelvin
    public static double CelciusVersKelvin(double tCelsius) {
        return tCelsius + 273.15;
    }

    // Méthode pour convertir Kelvin en Celsius
    public static double KelvinVersCelcius(double tKelvin) {
        return tKelvin - 273.15;
    }

    // Méthode pour convertir Fahrenheit en Celsius
    public static double FarenheitVersCelcius(double tFahrenheit) {
        return (tFahrenheit - 32) * 5 / 9;
    }

    // Méthode pour convertir Celsius en Fahrenheit
    public static double CelciusVersFarenheit(double tCelsius) {
        return (tCelsius * 9 / 5) + 32;
    }

    // Méthode pour convertir Kelvin en Fahrenheit
    public static double KelvinVersFarenheit(double tKelvin) {
        double celsius = KelvinVersCelcius(tKelvin);
        return CelciusVersFarenheit(celsius);
    }

    // Méthode pour convertir Fahrenheit en Kelvin
    public static double FarenheitVersKelvin(double tFahrenheit) {
        double celsius = FarenheitVersCelcius(tFahrenheit);
        return CelciusVersKelvin(celsius);
    }
}
