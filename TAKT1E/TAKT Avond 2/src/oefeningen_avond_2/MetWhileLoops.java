package oefeningen_avond_2;

public class MetWhileLoops {
    public static void main(String[] args) {
        Integer[] geboortejaar = {1954,1958,1958,1963,1963,1963,1964,1970,1970,1970};
        String[] geslacht = {"V","M","V","m","v","V","?","v","v","M"};
        String persoon = "";
        int teller = 0;
        int aantalMannen;
        int aantalVrouwen;
        int aantalMannenTotaal = 0;
        int aantalVrouwenTotaal = 0;
        int maximum = geboortejaar.length;

        while (teller < maximum) {
            System.out.println("Het geboortejaar is: " + geboortejaar[teller]);
            int hulpjaar = geboortejaar[teller];

            aantalMannen = 0;
            aantalVrouwen = 0;

            while (teller < maximum && geboortejaar[teller] == hulpjaar) {
                persoon = geslacht[teller].toLowerCase();
                if (persoon.equals("m")) {
                    aantalMannen++;
                    aantalMannenTotaal++;
                } else if (persoon.equals("v")) {
                    aantalVrouwen++;
                    aantalVrouwenTotaal++;
                } else {
                    System.out.println("Onbekend geslacht: "+geslacht[teller]);
                }
                teller++;
            }

            System.out.println("Het aantal mannen dit jaar: "+ aantalMannen);
            System.out.println("Het aantal vrouwen dit jaar: "+ aantalVrouwen);
        }
        System.out.println();
        System.out.println("--- DE TOTALE SOM VAN ALLE MANNEN EN VROUWEN ---");
        System.out.println("Het totaal aantal mannen: "+ aantalMannenTotaal);
        System.out.println("Het totaal aantal vrouwen: "+ aantalVrouwenTotaal);
    }
}
