package oefeningen_avond_2;

public class OefenOpdrachtWeer {
    public static void main(String[] args) {
        Integer[] geboortejaar = {1954,1958,1958,1963,1963,1963,1964,1970,1970,1970};
        String[] geslacht = {"V","M","V","m","v","V","?","v","v","M"};
        String persoon = "";
        int tellingen = 0;
        int teller = 0;
        int aantalMan = 0;
        int aantalVrouw = 0;
        int totaaltelling;

        for (int i = 0; i < geboortejaar.length; i++) {
            int hulpjaar = geboortejaar[i];

            persoon = geslacht[tellingen].toLowerCase();

            if (hulpjaar == geboortejaar[teller]) {
                if (persoon.equals("m")) {
                    aantalMan++;
                    i++;
                } else if (persoon.equals("v")) {
                    aantalVrouw++;
                    i++;
                } else {
                    System.out.println("Onbekend geslacht: "+geslacht[tellingen]);
                }

            } else {
                tellingen++;
            }
            teller++;

            System.out.println("Het aantal mannen: "+ aantalMan);
            System.out.println("Het aantal vrouwen: "+ aantalVrouw);
            System.out.println("Het geboortejaar is: " + hulpjaar);
        }
    }
}
