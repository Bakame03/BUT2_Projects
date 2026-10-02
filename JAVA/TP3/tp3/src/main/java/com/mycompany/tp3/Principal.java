/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3;

import java.util.Scanner;

/**
 *
 * @author bakame03
 */
public class Principal {
    public static void main(String[] args) {
        // 5.a. Déclarer un objet instance de la classe Mediatheque
        Mediatheque mediatheque = new Mediatheque();
        Scanner clavier = new Scanner(System.in);
        int choix = 0;

        // 5.b. Écrire un menu interactif (structure do...while et switch comme au CHAP6 diapo 21)
        do {
            System.out.println("\n========== MENU MÉDIATHÈQUE ==========");
            System.out.println("1. Ajouter un ouvrage");
            System.out.println("2. Afficher la liste des ouvrages");
            System.out.println("3. Quitter");
            System.out.print("Votre choix : ");
            
            if (clavier.hasNextInt()) {
                choix = clavier.nextInt();
                clavier.nextLine(); // Consommer le retour à la ligne
                
                switch (choix) {
                    case 1:
                        mediatheque.ajouterOuvrage();
                        break;
                    case 2:
                        mediatheque.afficherOuvrages();
                        break;
                    case 3:
                        System.out.println("Au revoir !");
                        break;
                    default:
                        System.out.println("Option inexistante. Veuillez réinventer un choix entre 1 et 3.");
                }
            } else {
                System.out.println("Veuillez saisir un nombre valide.");
                clavier.nextLine();
            }
        } while (choix != 3);
    }
}
