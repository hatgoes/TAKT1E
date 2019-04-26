package eindopdracht;

import java.util.Objects;

public class TellenMannenVrouwenMetKlasse {
    public static void main(String[] args) {

        // een object maken van klasse TellenEnRapporteren
        TellenEnRapporteren tellen = new TellenEnRapporteren();
        // waar wil ik de lijst uitlezen?


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



        int teller = 0;
        int maximum = personen.length;

        while (teller < maximum) {
//            System.out.println("Het geboortejaar is: " + eenGeboortejaar(personen, teller));
//            int hulpjaar = eenGeboortejaar(personen, teller);

            tellen.setAantalMannen(0);
            tellen.setAantalVrouwen(0);
            tellen.setAantalOnbekend(0);

//            while (teller < maximum && eenGeboortejaar(personen, teller) == hulpjaar) {
////
//                teller++;
//            }
//            System.out.println("Het aantal mannen dit jaar: " + aantalMannen);
//            System.out.println("Het aantal vrouwen dit jaar: " + aantalVrouwen);
//            System.out.println("Het aantal rest dit jaar: " + aantalRest);
//        }

            teller++;
        }
//
//        private static String eenGeslacht (String[]personen,int teller){
//            String persoongegevens = personen[teller];
//            String[] parts = persoongegevens.split(";");
//            return parts[1];
//        }
//
//        private static int eenGeboortejaar (String[]personen,int teller){
//            String persoongegevens = personen[teller];
//            String[] parts = persoongegevens.split(";");
//            return Integer.parseInt(parts[0].substring(6));
//        }
    }
}
