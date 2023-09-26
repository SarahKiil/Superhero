package Superheros;

public class Databasen {

        private Superhero[] superheroes;
        private int currentIndex;

        public Databasen(int size) {
            superheroes = new Superhero[size];
            currentIndex = 0;
        }

        public void addSuperhero(Superhero superhero) {
            if (currentIndex < superheroes.length) {
                superheroes[currentIndex] = superhero;
                currentIndex++;
                System.out.println("Superhelten er tilføjet til databasen.");
            } else {
                System.out.println("Databasen er fuld. Du kan ikke tilføje flere superhelte.");
            }
        }

        public Superhero[] getAllSuperheros() {
            return superheroes;
        }
    }

