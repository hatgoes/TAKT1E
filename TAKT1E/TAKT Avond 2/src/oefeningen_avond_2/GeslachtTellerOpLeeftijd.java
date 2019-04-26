package oefeningen_avond_2;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class GeslachtTellerOpLeeftijd {
    public static void main(String [] args) {
        lijstGeboortejarenCumulatief();



        String[] geslacht = {"V","M","V","m","v","V","?","v","v","M"};
        Integer[] geboortejaar = {1954,1958,1958,1963,1963,1963,1964,1970,1970,1970};
        int hulpjaar = 0;
        int vorigjaar = 0;
        int teller = 0;
        int totaalTelling;
        int tellingen = 0;
        int totaalMan = 0;
        int totaalVrouw = 0;
        int aantalMan = 0;
        int aantalVrouw = 0;

        for (int i = 0; i < geboortejaar.length; i++){
            if (vorigjaar != geboortejaar[i]) {
                aantalMan = 0;
                aantalVrouw = 0;
                System.out.println(geboortejaar[i]);
            }

            String persoon = geslacht[i].toLowerCase();
            if (persoon.equals("m")) {
                totaalMan++;
                aantalMan++;
            } else if (persoon.equals("v")) {
                totaalVrouw++;
                aantalVrouw++;
            } else {
            System.out.println("ONBEKEKEND GESLACHT    ");
            }

//            vorigjaar = geboortejaar[i];
//            if(geboortejaar[i] == (geboortejaar.length)-1 | geboortejaar[i] != geboortejaar[i+1]) {
//                System.out.println("M: " + aantalMan);
//                System.out.println("V: " + aantalVrouw);
//            }
        }
//        System.out.println("TELLINGEN TOTAAAL  "+tellingen);
//        System.out.println("TELLINGEN TOTAAAL M: " + totaalMan);
//        System.out.println("TELLINGEN TOTAAAL V: " + totaalVrouw);
    }


    // Er moet een overzicht komen met totaal aantallen per geboortejaar

    // Er moet een overzicht worden gemaakt van totaal aantal mannen en vrouwen

    // ik kan hier een methode maken die een array vult met random geboortedatums :)
    private IntegerArray vulLijstGeboortedatums() {
        Random rand = new Random(1954 - 1971);
        IntegerArray tijdelijke = new IntegerArray();
        int blaa = rand.nextInt();
        tijdelijke.add(blaa);
        return tijdelijke;
    }

    private static Integer[] lijstGeboortejarenCumulatief() {
        Integer[] geboortejaar = {1954,1958,1958,1963,1963,1963,1964,1970,1970,1970};
        String[] geslacht = {"V","M","V","m","v","V","?","v","v","M"};
        Integer[] tijdelijk = {};
        String persoon = "";
        int tellingen = 0;

        int aantalMan = 0;
        int aantalVrouw = 0;

        for (int i = 0; i < geboortejaar.length; i++) {
            int totaaltelling;
            int hulpjaar = geboortejaar[i];
            System.out.println("Het geboortejaar is: " + geboortejaar[i]);

            // hulpjaar

            if(hulpjaar == geboortejaar[tellingen]) {
                persoon = geslacht[tellingen].toLowerCase();
                if (persoon.equals("m")) {
                    aantalMan++;
                } else if (persoon.equals("v")) {
                    aantalVrouw++;
                } else {
                    System.out.println("Onbekend"+ geslacht[i]);
                }
                System.out.println("Het aantal mannen is: " + aantalMan);
                System.out.println("Het aantal vrouwen is: " + aantalVrouw);
                aantalMan = 0;
                aantalVrouw = 0;
                tellingen++;
            } else {
//                System.out.println("Het aantal mannen is: " + aantalMan);
//                System.out.println("Het aantal vrouwen is: " + aantalVrouw);
                aantalMan = 0;
                aantalVrouw = 0;
                tellingen++;
            }
            totaaltelling = aantalMan + aantalVrouw;
            System.out.println("TOTAAAAAL: " + totaaltelling);

        }
        return tijdelijk;
    }
}
