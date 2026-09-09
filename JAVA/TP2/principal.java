import java.util.ArrayList;

public class principal {
    public static void main(String[] args) {
        // 1. Déclarer une liste d'étudiants en utilisant la classe ArrayList
        ArrayList<Etudiant> listeEtudiants = new ArrayList<Etudiant>();

        // DEBUT DU TEST
        System.out.println("--- DEBUT DU TEST ---");
        
        // Appel de la fonction de remplissage
        remplirListe(listeEtudiants); 
        
        System.out.println("\n--- Affichage des étudiants saisis ---");
        // Appel de la fonction d'affichage
        afficherListe(listeEtudiants); 

        System.out.println("\n--- Recherche du meilleur étudiant ---");
        Etudiant top = meilleurEtudiant(listeEtudiants);
        if (top != null) {
            System.out.print("Le meilleur étudiant est : ");
            top.affiche();
        }

        System.out.println("\n--- Étudiants ayant une moyenne < 10 ---");
        ArrayList<Etudiant> lesRattrapages = etudiantsEnRattrapage(listeEtudiants);
        afficherListe(lesRattrapages);

        System.out.println("\n--- Tri des étudiants par nom (croissant) ---");
        trierParNom(listeEtudiants);
        afficherListe(listeEtudiants);

        System.out.println("\n--- Tri par ordre décroissant des moyennes ---");
        trierParMoyenneDecroissante(listeEtudiants);
        afficherListe(listeEtudiants);
        
        System.out.println("--- Fin du test ---");
        // -------------------------------------
    }

    // 2. fonction permettant de remplir une liste d'étudiants
    public static void remplirListe(ArrayList<Etudiant> liste) {
        java.util.Scanner clavier = new java.util.Scanner(System.in);
        String rep;

        do {
            System.out.print("Entrez le nom de l'étudiant : ");
            String nom = clavier.nextLine();

            System.out.print("Entrez le prénom de l'étudiant : ");
            String prenom = clavier.nextLine();

            System.out.print("Entrez la moyenne de l'étudiant : ");
            float moyenne = clavier.nextFloat();
            clavier.nextLine(); // Consommer le retour à la ligne restant (vu au CHAP2 diapo 15)

            // Création de l'objet Etudiant et ajout dans la ArrayList (vu au CHAP3 et CHAP6)
            Etudiant etud = new Etudiant(nom, prenom, moyenne);
            liste.add(etud);

            System.out.print("Voulez-vous saisir un autre étudiant ? (o/n) : ");
            rep = clavier.nextLine();

        } while (rep.equalsIgnoreCase("o")); // Utilisation de equalsIgnoreCase (vu au CHAP4 diapo 10)
    }

    // 3. fonction affichant une liste d'étudiants reçue en paramètre
    public static void afficherListe(ArrayList<Etudiant> liste) {
        // Boucle pour parcourir tous les étudiants de la liste (CHAP6 diapo 28)
        for (Etudiant etud : liste) {
            etud.affiche(); // Appelle la méthode affiche() de la classe Etudiant
        }
    }

    // fonction qui retourne l'étudiant ayant la meilleure moyenne
    public static Etudiant meilleurEtudiant(ArrayList<Etudiant> liste) {
        // Si la liste est vide, on retourne null pour éviter les erreurs
        if (liste.isEmpty()) {
            return null; 
        }

        // On initialise le meilleur étudiant avec le premier élément de la liste (CHAP6 diapo 23)
        Etudiant meilleur = liste.get(0);

        // On parcourt toute la liste pour trouver si quelqu'un a une meilleure moyenne (CHAP6 diapo 28)
        for (Etudiant etud : liste) {
            if (etud.moyenne > meilleur.moyenne) {
                meilleur = etud; // On a trouvé une meilleure moyenne, on met à jour
            }
        }

        return meilleur; // On retourne l'objet Etudiant trouvé
    }

    // 5. Fonction qui retourne une liste des étudiants ayant des moyennes < 10
    public static ArrayList<Etudiant> etudiantsEnRattrapage(ArrayList<Etudiant> liste) {
        // Création de la nouvelle liste qui va contenir les étudiants ciblés
        ArrayList<Etudiant> listeMauvaisesMoyennes = new ArrayList<Etudiant>();

        // Parcours de la liste reçue en paramètre
        for (Etudiant etud : liste) {
            if (etud.moyenne < 10) {
                listeMauvaisesMoyennes.add(etud); // Ajout dans la nouvelle liste
            }
        }

        return listeMauvaisesMoyennes; // On retourne la nouvelle liste filtrée
    }

    // fonction triant la liste des étudiants selon l'ordre croissant de leurs noms
    public static void trierParNom(ArrayList<Etudiant> liste) {
        // Tri en utilisant Comparator.comparing avec le getter getNom (CHAP6 diapo 53)
        liste.sort(java.util.Comparator.comparing(Etudiant::getNom));
    }

    // 7. Écrire une fonction triant la liste des étudiants selon l'ordre décroissant de leurs moyennes
    public static void trierParMoyenneDecroissante(ArrayList<Etudiant> liste) {
        // Tri par moyenne puis inversion de l'ordre avec .reversed() (CHAP6 diapo 54)
        liste.sort(java.util.Comparator.comparing(Etudiant::getMoyenne).reversed());
    }
}