/* OPPGAVETEKST:
Lag et program som beregner og skriver ut (i en dialogboks) summen
  2 + 4 + 6 + 8 + ... + 98    */

import javax.swing.JOptionPane;
import java.text.DecimalFormat; // For � styre antal desimalar p� double-verdiar


public class Veke5_Oppgave1_2gangen
{
    public static void main( String args[] )
    {
		String utskrift = "";
		for ( int i = 2; i <= 100; i += 2 ){
			utskrift += i + "\n";
		}
		JOptionPane.showMessageDialog( null, utskrift );

    } // slutt p� main-metoden
 } // slutt p� klassen Sammenlikning (oppgave13_minstetal)