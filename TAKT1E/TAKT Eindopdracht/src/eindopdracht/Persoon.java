package eindopdracht;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

public class Persoon {

    BufferedWriter writer = new BufferedWriter(new FileWriter("resultaat/overzichtpersonen.txt"));
    private int geboortejaar;
    private String geslacht;

    public Persoon() throws IOException {
    }

    public int getGeboortejaar() {
        return geboortejaar;
    }

    public void setGeboortejaar(int geboortejaar) {
        this.geboortejaar = geboortejaar;
    }

    public String getGeslacht() {
        return geslacht;
    }

    public void setGeslacht(String geslacht) {
        this.geslacht = geslacht;
    }

    public void schrijfGeboortejaar(int jaar) throws IOException {
        geboortejaar = jaar;
//        System.out.println("Het geboortejaar is: " + geboortejaar);
        writer.write("Het geboortejaar is: " + geboortejaar);
        writer.newLine();
//        writer.close();
    }

    public void wegschrijvenAantallen(int waarde, int teller) {
//        setAantalMannen(aantalMannen + waarde);
//        setAantalVrouwen(aantalVrouwen + waarde);
//        setAantalOnbekend(aantalOnbekend + waarde);
    }


    public void wegschrijvenTotalen(int totaalAantalMannen, int totaalAantalVrouwen, int totaalAantalOnbekend){
//        setTotaalAantalMannen(totaalAantalMannen);
//        setTotaalAantalVrouwen(totaalAantalVrouwen);
//        setTotaalAantalOnbekend(totaalAantalOnbekend);

        System.out.println();
        System.out.println("--- DE TOTALE SOM VAN ALLE MANNEN EN VROUWEN ---");
        System.out.println("Het totaal aantal mannen: " + totaalAantalMannen);
        System.out.println("Het totaal aantal vrouwen: " + totaalAantalVrouwen);
        System.out.println("Het totaal aantal rest: " + totaalAantalOnbekend);
    }
}
