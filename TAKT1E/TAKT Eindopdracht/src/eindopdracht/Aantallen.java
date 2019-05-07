package eindopdracht;

import java.io.*;

public class Aantallen {

    BufferedWriter writer = new BufferedWriter(new FileWriter("resultaat/overzichtpersonen.txt"));

    private int aantalMannen;
    private int aantalVrouwen;
    private int aantalOnbekend;

    public Aantallen() throws IOException {
    }

    public int getAantalMannen() {
        return aantalMannen;
    }

    public void setAantalMannen(int aantalMannen) {
        this.aantalMannen = aantalMannen;
    }

    public int getAantalVrouwen() {
        return aantalVrouwen;
    }

    public void setAantalVrouwen(int aantalVrouwen) {
        this.aantalVrouwen = aantalVrouwen;
    }

    public int getAantalOnbekend() {
        return aantalOnbekend;
    }

    public void setAantalOnbekend(int aantalOnbekend) {
        this.aantalOnbekend = aantalOnbekend;
    }

    public void optellenAantallen(int verhoging) throws IOException {
        aantalMannen = aantalMannen + verhoging;

        writer.write("Het aantal mannen dit jaar: " + aantalMannen);
        writer.newLine();
        writer.write("Het aantal vrouwen dit jaar: " + aantalVrouwen);
        writer.newLine();
        writer.write("Het aantal onbekend dit jaar: " + aantalOnbekend);
        writer.newLine();
        System.out.println("Het aantal mannen van dit jaar is: " + (aantalMannen));

//        writer.close();
    }
}
