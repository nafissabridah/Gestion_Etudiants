import java.util.Scanner;

public class Inscription {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander les informations à l'utilisateur
        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine();

        System.out.print("Entrez votre email : ");
        String email = scanner.nextLine();

        System.out.print("Entrez votre mot de passe : ");
        String motDePasse = scanner.nextLine();

        // Simuler l'enregistrement (dans une vraie app, on stockerait en base de données)
        System.out.println("\nInscription réussie !");
        System.out.println("Nom : " + nom);
        System.out.println("Email : " + email);

        scanner.close();
    }
}