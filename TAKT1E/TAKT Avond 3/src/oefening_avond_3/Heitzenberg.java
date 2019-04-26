package oefening_avond_3;

public class Heitzenberg {
    public static void main(String[] args) {

        String[] persoon = {"24-08-1954;V; Dijk, van;Maria"                // Vul tabel met persoonsgegevens
                , "02-03-1958;M;Groot, de;Jacob"
                , "17-06-1958;V;Winters;Felicia "
                , "12-01-1963;m;Swinkels;Mark"
                , "31-07-1963;v;Deutekom, van ;Lilian "
                , "05-11-1963;V;Jacht, van der ;Jolanda"
                , "19-08-1964;?;Puffelen,van;"
                , "22-05-1970;v;Dietvorst;Wilma "
                , "01-06-1970;v;Boogerts,den;Ester"
                , "19-09-1970;m;Konincks;Sven"};


        int aantalMannen;                                                 // Declareer variabelen, tellers op 0
        int aantalMannenTotaal = 0;
        int aantalVrouwen;
        int aantalVrouwenTotaal = 0;
        int loopTeller = 0;                                                 // Initialiseer loopteller
        int maximumAantal = persoon.length;
        int hulpJaar = 0;
        int geboortejaar = 0;
        String geslacht = "";

        while (loopTeller < maximumAantal) {                                    // Wiebertje C1
            for (int i = 0; i < persoon.length; i++) {
                String persoonsgegevens = persoon[loopTeller];
                String[] parts = persoonsgegevens.split(";");                  // Split regel
                geboortejaar = Integer.parseInt(parts[0].substring(6));
                System.out.println(geboortejaar);
                geslacht = parts[1];
                System.out.println(geslacht);
            }
            //Bepaal jaar en geslacht. Schrijf geboortejaar en bewaar dit in hulpjaar. Zet tellingen dit jaar op nul.
            aantalMannen = 0;
            aantalVrouwen = 0;

            while (loopTeller < maximumAantal && geboortejaar == hulpJaar) {
                if (geslacht.equalsIgnoreCase("M")) {
                    aantalMannen++;
                    aantalMannenTotaal++;
                } else if (geslacht.equalsIgnoreCase("V")) {
                    aantalVrouwen++;
                    aantalVrouwenTotaal++;
                } else {
                    System.out.println("Onbekend geslacht: " + geslacht);
                }
                loopTeller++;     // Verhoog loopteller
                System.out.println();
                // Nu volgt C1 weer met daarna een split regel ???
//            System.out.println("Aantal mannen: "+ aantalMannen);
//            System.out.println("Aantal vrouwen: "+ aantalVrouwen);
//            System.out.println("Aantal onbekend: "+ aantalOnb);
            }
        }
        /*
        System.out.println("---TOTALEN---");
        System.out.println("Aantal mannen totaal: "+ aantalMannenTotaal);
        System.out.println("Aantal vrouwen totaal: "+ aantalVrouwenTotaal);
        System.out.println("Aantal onbekenden totaal: "+ aantalOnbTotaal);
        */
    }
}
