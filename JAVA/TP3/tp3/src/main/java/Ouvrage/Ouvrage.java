/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3;

/**
 *
 * @author bakame03
 */
public class Ouvrage {
    private int id;           
    protected boolean emprunte; 

    public Ouvrage(int id, boolean emprunte) {
        this.id = id;
        this.emprunte = emprunte;
    }

    public int getId() {
        return id;
    }

    public void afficher() {
        System.out.println("Numéro d'identification : " + id);
        if (emprunte) {
            System.out.println("Statut : Emprunté");
        } else {
            System.out.println("Statut : Disponible");
        }
    }
}
