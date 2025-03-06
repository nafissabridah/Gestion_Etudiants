public class Accueil {
    public static void afficher() {
        //cette methode affiche le bienvenue au nouveau étudiants.
        System.out.println("Bienvenue sur la gestion des étudiants!");
    }


     public void ajouterEtudiant(String nom, int age) {
        Etudiant etudiant = new Etudiant(nom, age);
        etudiants.add(etudiant);
        System.out.println("Étudiant ajouté : " + etudiant);
    }






    public static void afficherEtudiants() {
        System.out.println("le nom de l'étudiant est:");
    }
}
