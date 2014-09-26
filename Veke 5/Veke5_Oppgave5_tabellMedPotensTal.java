/* OPPGAVETEKST:
Skriv et program som beregner og skriver ut andre og tredje potens av de hele tallene fra 0 til 10,
sammen med tallene selv, slik at du f�r en tabell tilsvarende det som er vist i dialogboksen nedenfor. */

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.text.NumberFormat;


public class Veke5_Oppgave5_tabellMedPotensTal
{
    public static void main( String args[] )
    {
		// Definer variablane for metoda.
		Integer fra=0 , til=10;
		// lag tekstomr�det for tabellen
		JTextArea tabellen = new JTextArea();
		// F�rst litt overskrifter
		tabellen.setText("Grunntal\t Andre potens\t Tredje potens\n");
		// S� loop som set inn tala.
		for ( int i=fra; i<=til; i+=1){
			tabellen.append(i+"\t");
			tabellen.append( (int)Math.pow( i,2 ) + "\t" ); //Type-casta for � gjere returverdien her om til int.
			tabellen.append( (int)Math.pow( i,3 ) + "\n" ); // Ditto...
		}
		// Til slutt, skriv ut tabellen i ei dialogboks.
		JOptionPane.showMessageDialog( null, tabellen);
	} // slutt p� main-metoden

} // slutt p� klasse