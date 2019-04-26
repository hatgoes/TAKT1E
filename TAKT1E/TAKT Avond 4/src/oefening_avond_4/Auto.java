package oefening_avond_4;

public class Auto {

    int actueleSnelheid = 130;
    int gewensteSnelheid = 0;

    public Auto(){
    }

    void setActueleSnelheid(int snelheid) {
        actueleSnelheid = snelheid;
    }

    public void setGewensteSnelheid(int snelheid) {
        gewensteSnelheid = snelheid;
    }

    public int getActueleSnelheid() {
        return actueleSnelheid;
    }

    public int getGewensteSnelheid() {
        return gewensteSnelheid;
    }

    public void verlaagSnelheid(int snelheid) {
        actueleSnelheid = actueleSnelheid - snelheid;
        System.out.println("De snelheid is na afname van het aantal km per uur: " + (actueleSnelheid));
    }
}
