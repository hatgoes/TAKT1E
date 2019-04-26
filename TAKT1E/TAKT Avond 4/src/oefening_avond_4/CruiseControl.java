package oefening_avond_4;

public class CruiseControl {
    public static void main(String[] args) {
        Auto mijnAuto = new Auto();
        mijnAuto.setGewensteSnelheid(100);

        while (mijnAuto.getActueleSnelheid() > mijnAuto.getGewensteSnelheid()) {
            mijnAuto.verlaagSnelheid(1);
            // hier wordt iets uitgeprint want dat is het enige dat de methode doet plus het berekenen van de nieuwe waarde
            // hier moet iets gebeuren waardoor actuele snelheid 1tje omlaag gaat en in de loop blijft
        }
    }
}
