/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3;

/**
 *
 * @author bakame03
 */
public class Livre extends Ouvrage {
    // 2.a. Données membres privées spécifiques à la classe Livre
    private String titre;
    private String auteur;

    // 2.b. Constructeur initialisant les données de la classe et de la classe de base (super)
    public Livre(int id, boolean emprunte, String titre, String auteur) {
        super(id, emprunte); // Appel du constructeur de la classe mère Ouvrage (CHAP3 diapo 26)
        this.titre = titre;
        this.auteur = auteur;
    }

    // 2.c. Méthode permettant d'afficher les caractéristiques d'un livre (+ celles de l'ouvrage)
    @Override
    public void afficher() {
        super.afficher(); // Affiche le numéro d'identification et le statut d'emprunt (CHAP3 diapo 24)
        System.out.println("Titre : " + titre);
        System.out.println("Auteur : " + auteur);
    }
}