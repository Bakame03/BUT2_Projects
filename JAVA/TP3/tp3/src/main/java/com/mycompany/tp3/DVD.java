/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3;

/**
 *
 * @author bakame03
 */
public class DVD extends Ouvrage {
    // 3.a. Un DVD est caractérisé par son titre et sa durée (en minutes)
    private String titre;
    private int duree;

    // 3.b. Constructeur recevant les paramètres pour la classe et la classe de base
    public DVD(int id, boolean emprunte, String titre, int duree) {
        super(id, emprunte); // Appel du constructeur de la classe mère Ouvrage
        this.titre = titre;
        this.duree = duree;
    }

    // 3.c. Méthode permettant d'afficher les caractéristiques d'un DVD (+ celles de l'ouvrage)
    @Override
    public void afficher() {
        super.afficher(); // Affiche le numéro d'identification et le statut d'emprunt
        System.out.println("Titre : " + titre);
        System.out.println("Durée : " + duree + " minutes");
    }
}
