package eindopdracht;

import java.io.*;

public class Aantallen {

    private BufferedWriter writer;

    private int aantalMannen;
    private int aantalVrouwen;
    private int aantalOnbekend;
    private int totaalAantalMannen;
    private int totaalAantalVrouwen;
    private int totaalAantalonbekend;

    public Aantallen() throws IOException {
        this.aantalMannen = 0;
        this.aantalVrouwen = 0;
        this.aantalOnbekend = 0;
        this.totaalAantalMannen = 0;
        this.totaalAantalVrouwen = 0;
        this.totaalAantalonbekend = 0;
        this.writer = new BufferedWriter(new FileWriter("C:\\Cursussen\\TAKT1E\\TAKT Eindopdracht\\resultaat\\overzichtpersonen.txt"));
    }

    public void resetAantallen() {
        aantalMannen = 0;
        aantalVrouwen = 0;
        aantalOnbekend = 0;
    }

    public void schrijfGeboortejaar(int jaar) throws IOException {
        writer.write("Het geboortejaar is: " + jaar);
        writer.newLine();
    }

    public void optellenAantallen(String geslacht) {
        if (geslacht.toLowerCase().equals("m")) {
            aantalMannen++;
            totaalAantalMannen++;
        } else if (geslacht.toLowerCase().equals("v")) {
            aantalVrouwen++;
            totaalAantalVrouwen++;
        } else {
            aantalOnbekend++;
            totaalAantalonbekend++;
        }
    }

    public void tellingenSchrijven() throws IOException {
        writer.write("Het aantal mannen dit jaar: " + this.aantalMannen);
        writer.newLine();
        writer.write("Het aantal vrouwen dit jaar: " + this.aantalVrouwen);
        writer.newLine();
        writer.write("Het aantal onbekend dit jaar: " + this.aantalOnbekend);
        writer.newLine();
        writer.newLine();
    }
    public void totaalTellingenSchrijven() throws IOException {
        writer.write("--- DE TOTALE SOM VAN ALLE MANNEN EN VROUWEN ---");
        writer.newLine();
        writer.write("Het totaal aantal mannen: " + totaalAantalMannen);
        writer.newLine();
        writer.write("Het totaal aantal vrouwen: " + totaalAantalVrouwen);
        writer.newLine();
        writer.write("Het totaal aantal rest: " + totaalAantalonbekend);
        writer.newLine();

    }

    public void sluitWriter() throws IOException {
        writer.close();
    }
}
