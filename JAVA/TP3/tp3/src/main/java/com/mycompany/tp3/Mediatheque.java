/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bakame03
 */
public class Mediatheque {
    // 4.a. Une médiathèque est caractérisée par une liste d'ouvrages (ArrayList)
    private ArrayList<Ouvrage> listeOuvrages;

    // Constructeur de la médiathèque
    public Mediatheque() {
        listeOuvrages = new ArrayList<Ouvrage>();
    }

    // 4.b. Méthode permettant d'ajouter un nouvel ouvrage
    public void ajouterOuvrage() {
        Scanner clavier = new Scanner(System.in);

        System.out.println("\n--- Ajout d'un nouvel ouvrage ---");
        System.out.print("Quel type d'ouvrage voulez-vous ajouter ? (1: Livre, 2: DVD) : ");
        int choix = clavier.nextInt();
        clavier.nextLine(); // Consommer le retour à la ligne

        System.out.print("Entrez le numéro d'identification : ");
        int id = clavier.nextInt();
        clavier.nextLine();

        System.out.print("L'ouvrage est-il emprunté ? (true/false) : ");
        boolean emprunte = clavier.nextBoolean();
        clavier.nextLine();

        if (choix == 1) {
            // Saisie spécifique pour un Livre
            System.out.print("Entrez le titre du livre : ");
            String titre = clavier.nextLine();

            System.out.print("Entrez l'auteur du livre : ");
            String auteur = clavier.nextLine();

            // Création et ajout du livre dans la liste d'ouvrages
            Livre nouveauLivre = new Livre(id, emprunte, titre, auteur);
            listeOuvrages.add(nouveauLivre);
            System.out.println("Livre ajouté avec succès !");

        } else if (choix == 2) {
            // Saisie spécifique pour un DVD
            System.out.print("Entrez le titre du DVD : ");
            String titre = clavier.nextLine();

            System.out.print("Entrez la durée du DVD (en minutes) : ");
            int duree = clavier.nextInt();
            clavier.nextLine();

            // Création et ajout du DVD dans la liste d'ouvrages
            DVD nouveauDVD = new DVD(id, emprunte, titre, duree);
            listeOuvrages.add(nouveauDVD);
            System.out.println("DVD ajouté avec succès !");

        } else {
            System.out.println("Choix invalide. Aucun ouvrage n'a été ajouté.");
        }
    }

    // 4.c. Méthode permettant d'afficher tous les ouvrages
    public void afficherOuvrages() {
        System.out.println("\n--- Liste des ouvrages de la médiathèque ---");
        if (listeOuvrages.isEmpty()) {
            System.out.println("La médiathèque ne contient aucun ouvrage.");
        } else {
            for (Ouvrage o : listeOuvrages) {
                o.afficher(); // Appel de la méthode d'affichage polymorphe
                System.out.println("-----------------------------------");
            }
        }
    }
}
