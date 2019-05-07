package eindopdracht;

import java.util.Objects;

public class OpgaveStringManipulatie {
    public static void main(String[] args) {
        String[] personen = new String[]{
                "24-08-1954;V;Dijk, van;Maria",
                "02-03-1958;M;Groot, de;Jacob",
                "17-06-1958;V;Winters;Felicia",
                "12-01-1963;m;Swinkels;Mark",
                "31-07-1963;v;Deutekom, van;Lilian",
                "05-11-1963;V;Jacht, van der;Jolanda",
                "19-08-1964;?;Puffelen, van;TEST",
                "22-05-1970;v;Dietvorst;Wilma",
                "01-06-1970;v;Boogerts, den;Ester",
                "19-09-1970;m;Konincks;Sven"
        };


        int aantalMannen;
        int aantalVrouwen;
        int aantalOnbekend;
        int aantalMannenTotaal = 0;
        int aantalVrouwenTotaal = 0;
        int aantalRestTotaal = 0;
        int teller = 0;
        int maximum = personen.length;

        while (teller < maximum) {
            System.out.println("Het geboortejaar is: " + eenGeboortejaar(personen, teller));
            int hulpjaar = eenGeboortejaar(personen, teller);

            aantalMannen = 0;
            aantalVrouwen = 0;
            aantalOnbekend = 0;

            while (teller < maximum && eenGeboortejaar(personen, teller) == hulpjaar) {
                if (Objects.equals(eenGeslacht(personen, teller).toLowerCase(), "m")) {
                    aantalMannen++;
                    aantalMannenTotaal++;
                } else if (Objects.equals(eenGeslacht(personen, teller).toLowerCase(), "v")) {
                    aantalVrouwen++;
                    aantalVrouwenTotaal++;
                } else {
                    aantalOnbekend++;
                    aantalRestTotaal++;
                    System.out.println("Onbekend geslacht: " + eenGeslacht(personen, teller));
                }
                teller++;
            }
            System.out.println("Het aantal mannen dit jaar: " + aantalMannen);
            System.out.println("Het aantal vrouwen dit jaar: " + aantalVrouwen);
            System.out.println("Het aantal rest dit jaar: " + aantalOnbekend);
        }
        System.out.println();
        System.out.println("--- DE TOTALE SOM VAN ALLE MANNEN EN VROUWEN ---");
        System.out.println("Het totaal aantal mannen: " + aantalMannenTotaal);
        System.out.println("Het totaal aantal vrouwen: " + aantalVrouwenTotaal);
        System.out.println("Het totaal aantal rest: " + aantalRestTotaal);
    }

    private static String eenGeslacht(String[] personen,int teller){
        String persoongegevens = personen[teller];
        String[] parts = persoongegevens.split(";");
        return parts[1];
    }

    private static int eenGeboortejaar(String[] personen, int teller){
        String persoongegevens = personen[teller];
        String[] parts = persoongegevens.split(";");
        return Integer.parseInt(parts[0].substring(6));
    }
}