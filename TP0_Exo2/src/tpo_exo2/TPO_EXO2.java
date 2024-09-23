/*
 * TP0 Exercice 2
 * TDC - Groupe 1
 * Martin Rouanet
 * 17 Septembre 2024
 */
package tpo_exo2;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class TPO_EXO2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
//Declaration des variables
int nb; // nombre dentiers a additionner
int result; // resultat
int ind; //indice
//nb=5;
result=0;
Scanner sc = new Scanner(System.in);
System.out.println("\n Entrer le nombre :");
nb=sc.nextInt(); // On demande a sc de donner le prochain entier
// Addition des nb premiers entiers
ind=1;
while (ind <= nb) {
result=result+ind;
ind++;
}
// Affichage du resultat
System.out.println();
System.out.println("La somme des "+ nb + "entiers est: "+result);
        
    }
    
}
