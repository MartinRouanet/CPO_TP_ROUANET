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
public class TP2_manip_ROUANET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Création d'un tableau de 10 références de Moussaka
        Moussaka[] moussakas = new Moussaka[10];

        // Initialisation des objets Moussaka
        for (int i = 0; i < moussakas.length; i++) {
            moussakas[i] = new Moussaka(300 + (i * 50)); // Chaque Moussaka a un nombre de calories croissant
        }

        // Affichage des calories de chaque Moussaka
        for (int i = 0; i < moussakas.length; i++) {
            System.out.println("Moussaka " + (i + 1) + " a " + moussakas[i].nbCalories + " calories.");
        }

            // Réponse à la question :
        // Non, une référence objet qui annonce référencer un type d’objet ne peut pas référencer un autre type qui n’a aucun rapport.
        // En Java, cela est dû à la sécurité de type.
        
        // Remarque sur la gestion de mémoire en Java
        // En Java, on ne peut pas "détruire" un objet explicitement.
        // Si un objet n'a plus de références qui pointent vers lui, il devient inaccessible.
        // Cela permet au ramasse-miettes (Garbage Collector) de libérer la mémoire si nécessaire.

        // Dernière question rhétorique
        // Oui, une référence vers un objet peut être un attribut d'un autre objet.
        // C'est effectivement une façon de modéliser une relation entre deux objets.
        // Par exemple, une classe "Plat" pourrait avoir une référence à un objet "Moussaka" en tant qu'attribut.
    }
}