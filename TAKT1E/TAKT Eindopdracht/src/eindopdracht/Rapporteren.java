package eindopdracht;

import java.io.*;

public class Rapporteren  {
    public static void main(String[]args) throws IOException {
        BufferedReader personen = new BufferedReader(new FileReader("eindopdracht/persoon.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("resultaat/overzichtpersonen.txt"));

        Persoon tellenEnRapporteren = new Persoon();

        int aantalMannen;
        int aantalVrouwen;
        int aantalOnbekend;

        String persoon = personen.readLine();

        while (persoon != null) {

            // ik wil het geboortejaar wel hebben
            // die zit in persoon
            // daarvoor moet ik het eerst
            String[] parts = persoon.split(";");
            int geboortejaar = Integer.parseInt(parts[0].substring(6));
            tellenEnRapporteren.setGeboortejaar(geboortejaar);

            int hulpjaar = tellenEnRapporteren.getGeboortejaar();

//            writer.write("Het geboortejaar is: " + hulpjaar);
//            writer.newLine();

            tellenEnRapporteren.schrijfGeboortejaar(geboortejaar);

            aantalMannen = 0;
            aantalVrouwen = 0;
            aantalOnbekend = 0;


            // ############# TOT HIER WAT IK NU HEB

//            while (persoon != null && eenGeboortejaar(persoon) == hulpjaar) {
//
//                if (eenGeslacht(persoon).toLowerCase().equals("m")) {
//                    aantalMannen++;
//                    aantalMannenTotaal++;
//                } else if (eenGeslacht(persoon).toLowerCase().equals("v")) {
//                    aantalVrouwen++;
//                    aantalVrouwenTotaal++;
//                } else {
//                    aantalOnbekend++;
//                    aantalOnbekendTotaal++;
//                }
                persoon = personen.readLine();
//            }
//            writer.write("Het aantal mannen dit jaar: " + aantalMannen);
//            writer.newLine();
//            writer.write("Het aantal vrouwen dit jaar: " + aantalVrouwen);
//            writer.newLine();
//            writer.write("Het aantal onbekend dit jaar: " + aantalOnbekend);
//            writer.newLine();
        }
//        writer.newLine();
//        writer.write("--- DE TOTALE SOM VAN ALLE MANNEN EN VROUWEN ---");
//        writer.newLine();
//        writer.write("Het totaal aantal mannen: " + aantalMannenTotaal);
//        writer.newLine();
//        writer.write("Het totaal aantal vrouwen: " + aantalVrouwenTotaal);
//        writer.newLine();
//        writer.write("Het totaal aantal rest: " + aantalRestTotaal);
//        writer.newLine();

        personen.close();
        writer.close();





    }
}
