package eindopdracht;

import java.io.*;

public class Rapporteren  {
    public static void main(String[]args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Cursussen\\TAKT1E\\TAKT Eindopdracht\\testdata\\persoon.txt"));
        Aantallen aantallen = new Aantallen();
        String persoon = reader.readLine();

        while (persoon != null) {
            int hulpjaar = eenGeboortejaar(persoon);
            aantallen.schrijfGeboortejaar(hulpjaar);
            aantallen.resetAantallen();

            while (persoon != null &&
                    eenGeboortejaar(persoon) == hulpjaar) {
                String geslacht = eenGeslacht(persoon);
                // hier wordt de waarde geslacht door gegeven en opgeteld
                aantallen.optellenAantallen(geslacht);
                persoon = reader.readLine();
            }
            aantallen.tellingenSchrijven();
        }
        aantallen.totaalTellingenSchrijven();

        reader.close();
        aantallen.sluitWriter();
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
