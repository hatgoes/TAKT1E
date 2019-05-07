package oefening_avond_5;

import java.io.*;

public class InputOutputOpgave {
    public static void main(String[] args) throws IOException {
        BufferedReader personen = new BufferedReader(new FileReader("eindopdracht/testdata/persoon.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("resultaat/overzichtpersonen.txt"));

        int aantalMannen;
        int aantalVrouwen;
        int aantalRest;
        int aantalMannenTotaal = 0;
        int aantalVrouwenTotaal = 0;
        int aantalRestTotaal = 0;

        String persoon = personen.readLine();

        while (persoon != null) {
            int hulpjaar = eenGeboortejaar(persoon);
            writer.write("Het geboortejaar is: " + hulpjaar);
            writer.newLine();

            aantalMannen = 0;
            aantalVrouwen = 0;
            aantalRest = 0;

            while (persoon != null && eenGeboortejaar(persoon) == hulpjaar) {
                if (eenGeslacht(persoon).toLowerCase().equals("m")) {
                    aantalMannen++;
                    aantalMannenTotaal++;
                } else if (eenGeslacht(persoon).toLowerCase().equals("v")) {
                    aantalVrouwen++;
                    aantalVrouwenTotaal++;
                } else {
                    aantalRest++;
                    aantalRestTotaal++;
                }
                persoon = personen.readLine();
            }
            writer.write("Het aantal mannen dit jaar: " + aantalMannen);
            writer.newLine();
            writer.write("Het aantal vrouwen dit jaar: " + aantalVrouwen);
            writer.newLine();
            writer.write("Het aantal onbekend dit jaar: " + aantalRest);
            writer.newLine();
        }
        writer.newLine();
        writer.write("--- DE TOTALE SOM VAN ALLE MANNEN EN VROUWEN ---");
        writer.newLine();
        writer.write("Het totaal aantal mannen: " + aantalMannenTotaal);
        writer.newLine();
        writer.write("Het totaal aantal vrouwen: " + aantalVrouwenTotaal);
        writer.newLine();
        writer.write("Het totaal aantal rest: " + aantalRestTotaal);
        writer.newLine();

        personen.close();
        writer.close();
    }

    private static String eenGeslacht(String persoon){
        String[] parts = persoon.split(";");
        return parts[1];
    }

    private static int eenGeboortejaar(String persoon){
        String[] parts = persoon.split(";");
        return Integer.parseInt(parts[0].substring(6));
    }
}

