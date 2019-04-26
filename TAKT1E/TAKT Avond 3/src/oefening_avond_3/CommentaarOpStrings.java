package oefening_avond_3;

public class CommentaarOpStrings {

    public static void main(String[] args) {

        String strIn = "Welkom op de cursus Takt";
        String strDelKar = "s";

        System.out.println(filter(strIn, strDelKar));
    }

    private static String filter(String strIn, String strDelKar) {

        /**
         *  Beschrijving: Functie om string uit te lezen om vervolgens een string manipulatie uit te voeren
         *  door karakters te verwijderen uit een string input
         *
         *  @param strIn is de input string die wordt gebruikt om de lengte uit te lezen
         *  @param strDelKar wordt gebruikt om eenzelfde voorkomend karakter(s) te verwijderen
         *  @return strOut geeft het eindresultaat van de methode filter terug als String
         */


        int i; // Declareer teller
        int intLen; // declareer de lengte van de string
        String strKar; // declareer String karakter wordt gebruikt in if statement voor vergelijking het te deleten karakter
        String strOut; // declareer string wordt gebruikt om de output van deze methode terug te geven

        strOut = ""; // initialiseer strOut
        intLen = strIn.length(); // lees de lengte van string strIn en zet de waarde in intLen
        i = 0; // initialiseer teller met de waarde 0

        while (i < intLen)
        {
            strKar = String.valueOf(strIn.charAt(i));

            if (!strKar.equals(strDelKar))
            {
                strOut = strOut + strKar;
            }

            i = i + 1;
        }
        return strOut;
    }
}
