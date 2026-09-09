public class Etudiant {
    // données membres (attributs) de la classe
    public String nom;
    public String prenom;
    public float moyenne;

    // constructeur recevant en paramètres un nom, un prénom et une moyenne
    public Etudiant(String n, String p, float m) {
        nom = n;
        prenom = p;
        moyenne = m;
    }

    // méthode affiche()
    public void affiche() {
        System.out.println(prenom + " " + nom + " a une moyenne de " + moyenne);
    }
}