import javax.swing.JOptionPane;
import java.util.Calendar;

public class Oppgave14_deleligMedTre
{
    public static void main( String args[] )
    {
       String f�rsteSifferstreng;   // brukes ved innlesing
       String resultat;        // tekststreng som brukes til utskrift

       int f�rstetall;          // f�rste tall som skal sammenliknes
       f�rsteSifferstreng = JOptionPane.showInputDialog( "Skriv f�rste heltall:" );

       // konverterer sifferstrenger til heltallsverdier
       f�rstetall = Integer.parseInt( f�rsteSifferstreng );

       // initialiserer utskriftsstrengen til en tom streng
       resultat = "";

		if ( (f�rstetall%3)==0 )  resultat = f�rstetall + " er delelig med 3";
		else resultat = f�rstetall + " er IKKJE delelig med 3";
       // Viser resultat av sammenlikningene
       JOptionPane.showMessageDialog( null, resultat, "Sammenlikningsresultater",
          JOptionPane.INFORMATION_MESSAGE );
    } // slutt p� main-metoden
 } // slutt p� klassen Sammenlikning (oppgave13_minstetal)