package oefening_avond_3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Manipulatie  {
    public static void main(String[] args) {
        String[] personen = new String[] {"24-08-1954;V; Dijk, van;Maria","02-03-1958;M; Groot, de;Jacob","17-06-1958;V; Winters;Felicia","12-01-1963;m; Swinkels;Mark",
                "31-07-1963;v; Deutekom, van;Lilian","05-11-1963;V; Jacht, van der;Jolanda","19-08-1964;?; Puffelen, van;","22-05-1970;v; Dietvorst;Wilma",
                "01-06-1970;v; Boogerts, den;Ester","19-09-1970;m; Konincks;Sven"};

        String persoon = "";
        int aantalMan = 0;
        int aantalVrouw = 0;
        int aantOnbekend = 0;
        int aantManTot = 0;
        int aantVrouwTot = 0;
        int aantalRestTotaal = 0;
        int loopTeller = 0;
        int geboortejaar = 0;
        int max = personen.length;

        while (loopTeller < max) {
//            for (int i = 0; i < personen.length; i++) {
//                String persoongegevens = personen[loopTeller];
//                String[] parts = persoongegevens.split(";");
//                geboortejaar = Integer.parseInt(parts[0].substring(6));
//            }

            String persoongegevens = personen[loopTeller];
            String[] parts = persoongegevens.split(";");
            int hulpjaar = Integer.parseInt(parts[0].substring(6));

            aantalMan = 0;
            aantalVrouw = 0;
            aantOnbekend = 0;
            int nieuweTeller = 0;
//            String geslacht = "M";

            while (loopTeller < max && geboortejaar == hulpjaar) {
                String geslacht = parts[1];
                if (geslacht.toLowerCase().equals("m")) {
                    aantalMan++;
                    aantManTot++;
                } else if (geslacht.toLowerCase().equals("v")) {
                    aantalVrouw++;
                    aantVrouwTot++;
                } else {
                    aantOnbekend++;
                    aantalRestTotaal++;
                    System.out.println("Onbekend geslacht: " + geslacht);
                }
                loopTeller++;
            }
            System.out.println("Het aantal mannen dit jaar: "+ aantalMan);
            System.out.println("Het aantal vrouwen dit jaar: "+ aantalVrouw);
            System.out.println("Het aantal rest dit jaar: "+ aantOnbekend);

//            System.out.println();
//            System.out.println("WAAROM WORDT ALLEEN HET EERSTE OBJECT IN DE ARRAY GEPRINT??");
//            System.out.println();

//            loopTeller++;
        }
        System.out.println();
        System.out.println("--- DE TOTALE SOM VAN ALLE MANNEN EN VROUWEN ---");
        System.out.println("Het totaal aantal mannen: "+ aantManTot);
        System.out.println("Het totaal aantal vrouwen: "+ aantVrouwTot);
        System.out.println("Het totaal aantal rest: "+ aantalRestTotaal);
        System.out.println();
    }
}
