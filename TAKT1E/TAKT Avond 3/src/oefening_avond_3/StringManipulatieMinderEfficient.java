package oefening_avond_3;

public class StringManipulatieMinderEfficient {
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

        String[] geslachten = lijstGeslachten(personen);
        int[] geboortejaren = lijstGeboortejaren(personen);

        int aantalMannen;
        int aantalVrouwen;
        int aantalRest;
        int aantalMannenTotaal = 0;
        int aantalVrouwenTotaal = 0;
        int aantalRestTotaal = 0;
        int teller = 0;
        int maximum = personen.length;

        while (teller < maximum) {
            System.out.println("Het geboortejaar is: " + geboortejaren[teller]);
            int hulpjaar = geboortejaren[teller];

            aantalMannen = 0;
            aantalVrouwen = 0;
            aantalRest = 0;

            while (teller < maximum && geboortejaren[teller] == hulpjaar) {
                if (geslachten[teller].toLowerCase().equals("m")) {
                    aantalMannen++;
                    aantalMannenTotaal++;
                } else if (geslachten[teller].toLowerCase().equals("v")) {
                    aantalVrouwen++;
                    aantalVrouwenTotaal++;
                } else {
                    aantalRest++;
                    aantalRestTotaal++;
                    System.out.println("Onbekend geslacht: " + geslachten[teller]);
                }
                teller++;
            }
            System.out.println("Het aantal mannen dit jaar: " + aantalMannen);
            System.out.println("Het aantal vrouwen dit jaar: " + aantalVrouwen);
            System.out.println("Het aantal rest dit jaar: " + aantalRest);
        }
        System.out.println();
        System.out.println("--- DE TOTALE SOM VAN ALLE MANNEN EN VROUWEN ---");
        System.out.println("Het totaal aantal mannen: " + aantalMannenTotaal);
        System.out.println("Het totaal aantal vrouwen: " + aantalVrouwenTotaal);
        System.out.println("Het totaal aantal rest: " + aantalRestTotaal);
    }

    private static String[] lijstGeslachten(String[] personen){
        String[] geslachten = new String[personen.length];

        for(int j = 0; j < personen.length;j++) {
            String persoongegevens = personen[j];
            String[] parts = persoongegevens.split(";");
            geslachten[j] = parts[1];
        }
        return geslachten;
    }

    private static int[] lijstGeboortejaren(String[] personen){
        int[] geboortejaren = new int[personen.length];

        for(int j = 0; j < personen.length;j++) {
            String persoongegevens = personen[j];
            String[] parts = persoongegevens.split(";");
            geboortejaren[j] = Integer.parseInt(parts[0].substring(6));
        }
        return geboortejaren;
    }
}