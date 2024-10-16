/*
 * TP2 Exercice 2
 * TDC - Groupe 1
 * Martin Rouanet
 * 11 Octobre 2024
 */
package tp2_convertisseurobjet_rouanet;

/**
 *
 * @author marti
 */
public class Convertisseur {
    private int nbConversions; // Attribut pour compter le nombre de conversions

    // Constructeur par défaut
    public Convertisseur() {
        nbConversions = 0; // Initialisation de nbConversions à 0
    }

    // Méthode pour convertir Celsius en Kelvin
    public double CelciusVersKelvin(double tCelsius) {
        nbConversions++; // Incrémente le compteur de conversions
        return tCelsius + 273.15;
    }

    // Méthode pour convertir Kelvin en Celsius
    public double KelvinVersCelcius(double tKelvin) {
        nbConversions++; // Incrémente le compteur de conversions
        return tKelvin - 273.15;
    }

    // Méthode pour convertir Fahrenheit en Celsius
    public double FarenheitVersCelcius(double tFahrenheit) {
        nbConversions++; // Incrémente le compteur de conversions
        return (tFahrenheit - 32) * 5 / 9;
    }

    // Méthode pour convertir Celsius en Fahrenheit
    public double CelciusVersFarenheit(double tCelsius) {
        nbConversions++; // Incrémente le compteur de conversions
        return (tCelsius * 9 / 5) + 32;
    }

    // Méthode pour convertir Kelvin en Fahrenheit
    public double KelvinVersFarenheit(double tKelvin) {
        nbConversions++; // Incrémente le compteur de conversions
        double celsius = KelvinVersCelcius(tKelvin);
        return CelciusVersFarenheit(celsius);
    }

    // Méthode pour convertir Fahrenheit en Kelvin
    public double FarenheitVersKelvin(double tFahrenheit) {
        nbConversions++; // Incrémente le compteur de conversions
        double celsius = FarenheitVersCelcius(tFahrenheit);
        return CelciusVersKelvin(celsius);
    }

    // Méthode toString pour afficher le nombre de conversions
    @Override
    public String toString() {
        return "nb de conversions: " + nbConversions;
    }
}