package oefeningen_avond_2;

public class GeslachtPerGeboortejaar {
    public static void main(String[] args) {
        Integer[] geboortejaar = {1954,1958,1958,1963,1963,1963,1964,1970,1970,1970};
        String[] geslacht = {"V","M","V","m","v","V","?","v","v","M"};
        String persoon = "";
        int tellingen = 0;
        int aantalMan = 0;
        int aantalVrouw = 0;
        int totaaltelling;

        for (int i = 0; i < geboortejaar.length; i++) {
            int hulpjaar = geboortejaar[i];
            persoon = geslacht[i];

            if (persoon.toLowerCase() == "m") {
                aantalMan++;
            } else if (persoon.toLowerCase() == "v") {
                aantalVrouw++;
            } else {
                System.out.println("Onbekend geslacht: "+geslacht[i]);
            }

            // hulpjaar <- 1954
            System.out.println("Het geboortejaar is: " + hulpjaar);

            // ik ga door de beide arrays
            // if geslacht[i] ==  "M" || "m"
            // doe dan tel aantal M



            if(geboortejaar[tellingen] != hulpjaar) {
                // 1954 is niet gelijk aan hulpjaar
                // dan wil ik hulpjaar verhogen
                 i++;

                persoon = geslacht[tellingen].toLowerCase();

                if (persoon.equals("m")) {
                    aantalMan++;
                } else if (persoon.equals("v")) {
                    aantalVrouw++;
                } else {
                    System.out.println("Onbekend: "+ geslacht[i]);
                }

            } else {
                // wanneer hulpjaar wel gelijk is
                // dan wil ik het geslacht lezen
                tellingen++;
                System.out.println("Het aantal mannen is: " + aantalMan);
                System.out.println("Het aantal vrouwen is: " + aantalVrouw);
                aantalMan = 0;
                aantalVrouw = 0;
            }
            totaaltelling = aantalMan + aantalVrouw;
            System.out.println("TOTAAAAAL: " + totaaltelling);
        }
    }
}
