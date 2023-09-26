package Superheros;

public class Superhero {

        private String navn;
        private String superkraft;
        private int bygningsÅr;
        private int styrke;
        private String virkeligeNavn;
        private String erMenneske;

        public Superhero(String navn, String superkraft, int bygningsÅr, int styrke, String virkeligeNavn, String erMenneske) {
            this.navn = navn;
            this.superkraft = superkraft;
            this.bygningsÅr = bygningsÅr;
            this.styrke = styrke;
            this.virkeligeNavn = virkeligeNavn;
            this.erMenneske = erMenneske;
        }

        public String getNavn() {
            return navn;
        }

        public String getSuperkraft() {
            return superkraft;
        }

        public int getBygningsÅr() {
            return bygningsÅr;
        }

        public int getStyrke() {
            return styrke;
        }

        public String getVirkeligeNavn() {
            return virkeligeNavn;
        }

        public String getErMenneske() {
            return erMenneske;
        }

        public String toString() {
            return "Superhelts Navn: " + navn + "\n"
                    + "Superkraft: " + superkraft + "\n"
                    + "Bygningsår: " + bygningsÅr + "\n"
                    + "Styrkelevel: " + styrke + "\n"
                    + "Virkelige Navn: " + virkeligeNavn + "\n"
                    + "Er Menneske: " + erMenneske + "\n";
        }
    }

