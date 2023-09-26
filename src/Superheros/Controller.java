package Superheros;

public class Controller {

        public static void tilføjSuperhelt(Databasen database, String navn, String virkeligeNavn, String superkraft, int bygningsÅr, String erMenneske, int styrke) {
            Superhero superhero = new Superhero(navn, superkraft, bygningsÅr, styrke, virkeligeNavn, erMenneske);
            database.addSuperhero(superhero);
        }

    // Method to search for a superhero by name or part of the name

    public static Superhero søgSuperhelt(Databasen database, String søgekriterium) {
        Superhero[] superhelte = database.getAllSuperheros();

        // Loop through the superheroes and find the first one that matches the search criteria
        for (Superhero superhero : superhelte) {
            if (superhero != null && superhero.getNavn().toLowerCase().contains(søgekriterium.toLowerCase())) {
                return superhero; // Return the found superhero
            }
        }

        return null; // Return null if no match is found
    }
}