package eindopdracht;

import java.util.Objects;

public class TellenEnRapporteren {
    int aantalMannen = 0;
    int aantalVrouwen = 0;
    int aantalOnbekend = 0;

    int totaalAantalMannen = 0;
    int totaalAantalVrouwen = 0;
    int totaalAantalOnbekend = 0;


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

    public int getTotaalAantalMannen() {
        return totaalAantalMannen;
    }

    public void setTotaalAantalMannen(int totaalAantalMannen) {
        this.totaalAantalMannen = totaalAantalMannen;
    }

    public int getTotaalAantalVrouwen() {
        return totaalAantalVrouwen;
    }

    public void setTotaalAantalVrouwen(int totaalAantalVrouwen) {
        this.totaalAantalVrouwen = totaalAantalVrouwen;
    }

    public int getTotaalAantalOnbekend() {
        return totaalAantalOnbekend;
    }

    public void setTotaalAantalOnbekend(int totaalAantalOnbekend) {
        this.totaalAantalOnbekend = totaalAantalOnbekend;
    }

    public void wegschrijvenAantallen(int waarde, int teller) {

        setAantalMannen(aantalMannen + waarde);
        setAantalVrouwen(aantalVrouwen + waarde);
        setAantalOnbekend(aantalOnbekend + waarde);

//        if (eenGeslacht(personen, teller).toLowerCase().equals("m")) {
//            aantalMannen++;
//            aantalMannenTotaal++;
//        } else if (Objects.equals(eenGeslacht(personen, teller).toLowerCase(), "v")) {
//            aantalVrouwen++;
//            aantalVrouwenTotaal++;
//        } else {
//            aantalRest++;
//            aantalRestTotaal++;
//            System.out.println("Onbekend geslacht: " + eenGeslacht(personen, teller));
//        }
        System.out.println("Het aantal mannen dit jaar: " + this.aantalMannen);
        System.out.println("Het aantal vrouwen dit jaar: " + this.aantalVrouwen);
        System.out.println("Het aantal rest dit jaar: " + this.aantalOnbekend);
    }

    public void wegschrijvenTotalen(int totaalAantalMannen, int totaalAantalVrouwen, int totaalAantalOnbekend){
        setTotaalAantalMannen(totaalAantalMannen);
        setTotaalAantalVrouwen(totaalAantalVrouwen);
        setTotaalAantalOnbekend(totaalAantalOnbekend);

        System.out.println();
        System.out.println("--- DE TOTALE SOM VAN ALLE MANNEN EN VROUWEN ---");
        System.out.println("Het totaal aantal mannen: " + totaalAantalMannen);
        System.out.println("Het totaal aantal vrouwen: " + totaalAantalVrouwen);
        System.out.println("Het totaal aantal rest: " + totaalAantalOnbekend);
    }
}
