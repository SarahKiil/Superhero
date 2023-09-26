package Superheros;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Databasen database = new Databasen(5);

        System.out.println("Velkommen til superhelt universet!");
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Opret superhelt");
            System.out.println("2. Se dine superhelte");
            System.out.println("3. Søg efter superhelt");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Skriv superhelts navn: ");
                String navn = scanner.nextLine();
                System.out.print("Skriv superhelts kraft: ");
                String superkraft = scanner.nextLine();
                System.out.print("Skriv superheltens bygningsår: ");
                int bygningsÅr = 0;
                boolean validInput = false;
                while (!validInput) {
                    try {
                        System.out.print("Skriv superheltens bygningsår (tal): ");
                        bygningsÅr = Integer.parseInt(scanner.nextLine());
                        validInput = true;
                    } catch (NumberFormatException e) {
                        System.out.println("Forkert input. Skriv venligst et tal for bygningsår.");
                    }
                }
                scanner.nextLine();
                System.out.print("Skriv superhelts styrkelevel: ");
                int styrke = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Skriv superhelts virkelige navn: ");
                String virkeligeNavn = scanner.nextLine();
                System.out.print("Er din superhelt et menneske? (Ja/Nej): ");
                String erMenneske = scanner.nextLine();

                System.out.println("Din superhelt er nu oprettet!");

                Controller.tilføjSuperhelt(database, navn, virkeligeNavn, superkraft, bygningsÅr, erMenneske, styrke);
            } else if (choice == 2) {
                visSuperhelte(database);

            } else if (choice == 3) {

                System.out.print("Skriv superhelts navn eller del af navn: ");
                String searchCriteria = scanner.nextLine();
                Superhero foundSuperhero = Controller.søgSuperhelt(database, searchCriteria);
                if (foundSuperhero != null) {
                    System.out.println("Superhelt fundet:");
                    System.out.println(foundSuperhero);
                } else {
                    System.out.println("Ingen superhelt fundet med det angivne kriterium.");
                }

            }

            {

            } if (choice == 4) {
                System.out.println("Går ud af program.");
                break;
            } else {
                System.out.println("Ugyldigt valg, prøv igen.");
            }
        }

        scanner.close();
    }

    public static void visSuperhelte(Databasen database) {
        System.out.println("Superhelte i din database:");
        Superhero[] superhelte = database.getAllSuperheros();
        for (Superhero superhero : superhelte) {
            if (superhero != null) {
                System.out.println(superhero);
            }
        }
    }
}
