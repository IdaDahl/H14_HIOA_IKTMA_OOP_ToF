import javax.swing.JOptionPane;
import java.util.Calendar;

public class Oppgave15_minsteTallAvTre
{
    public static void main( String args[] )
    {
       String f�rsteSifferstreng, andreSifferstreng, tredjeSifferstreng, resultat; // tekststrenger

       int f�rstetall = Integer.parseInt( JOptionPane.showInputDialog( "Skriv f�rste heltall:" ) );
       int andretall = Integer.parseInt( JOptionPane.showInputDialog( "Skriv andre heltall:" ) );
       int tredjetall = Integer.parseInt( JOptionPane.showInputDialog( "Skriv tredje heltall:" ) );

       // initialiserer utskriftsstrengen til at f�rste tall er minst (i tilfelle det stemmer)
       resultat = f�rstetall+" er minst";

		if ( (andretall<f�rstetall) && (andretall<tredjetall)  )
          resultat = andretall + " er minst";
        if ( (tredjetall<f�rstetall) && (tredjetall<andretall)  )
          resultat = tredjetall + " er minst";

       // Viser resultat av sammenlikningene
       JOptionPane.showMessageDialog( null, resultat, "Minste tal av 3",
          JOptionPane.INFORMATION_MESSAGE );
    } // slutt p� main-metoden
 } // slutt p� klassen Sammenlikning (oppgave13_minstetal)