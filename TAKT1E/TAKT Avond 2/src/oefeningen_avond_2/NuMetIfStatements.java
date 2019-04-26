package oefeningen_avond_2;

public class NuMetIfStatements {
    public static void main(String[] args) {
        Integer[] geboortejaar = {1954,1958,1958,1963,1963,1963,1964,1970,1970,1970};
        String[] geslacht = {"V","M","V","m","v","V","?","v","v","M"};
        String persoon = "";
        int tellingen = 0;
        int teller = 0;
        int aantalMan = 0;
        int aantalVrouw = 0;
        int totaaltelling;


        // schrijf alleen het geboortejaar wanneer alle mannen en vrouwen zijn geteld tot een afwijkend geboortejaar

        for (int j = 0; j < geboortejaar.length; j++) {
            int hulpjaar2 = geboortejaar[j];
            persoon = geslacht[j].toLowerCase();

            if (geboortejaar[tellingen] == hulpjaar2) {
                if (persoon.equals("m")) {
                    aantalMan++;
                } else if (persoon.equals("v")) {
                    aantalVrouw++;
                } else {
                    System.out.println("Onbekend geslacht: "+geslacht[j]);
                }

            } else {
                tellingen++;
                System.out.println(hulpjaar2);
            }


//            System.out.println(hulpjaar2);

        }

//        for (int j = 0; j < geslacht.length; j++) {
//
//            int hulpjaar = geboortejaar[tellingen];
//            persoon = geslacht[j].toLowerCase();
//            if (persoon.equals("m")) {
//                aantalMan++;
//            } else if (persoon.equals("v")) {
//                aantalVrouw++;
//            } else {
//                System.out.println("Onbekend geslacht: "+geslacht[tellingen]);
//            }
//            tellingen++;
//            System.out.println(hulpjaar);
//        }


//        for (teller = 0; teller < geboortejaar.length; teller++) {
//            int hulpjaar = geboortejaar[teller];
//
//            if (tellingen < geboortejaar.length && geboortejaar[teller] == hulpjaar) {
//                persoon = geslacht[tellingen].toLowerCase();
//                if (persoon.equals("m")) {
//                    aantalMan++;
//                } else if (persoon.equals("v")) {
//                    aantalVrouw++;
//                } else {
//                    System.out.println("Onbekend geslacht: "+geslacht[tellingen]);
//                }
//            } else {
//                tellingen++;
//            }
            System.out.println(geboortejaar[teller]);
            System.out.println("Het aantal mannen: "+ aantalMan);
            System.out.println("Het aantal vrouwen: "+ aantalVrouw);

    }
}
