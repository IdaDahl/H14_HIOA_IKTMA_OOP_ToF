/* OPPGAVETEKST:
Lag et program som leser inn hele tall fra brukeren inntil det blir lest inn et negativt tall.
Programmet skal telle opp hvor mange av de innleste tallene som er mellom 10 og 50
(ingen av grensene inkludert) og skrive ut dette antallet.
 */

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.text.NumberFormat;


public class Veke5_Oppgave7_heltalMellom10og50
{
    public static void main( String args[] )
    {
		// Definer variablane for metoda.
		Integer nedreGrense=10 , ovreGrense=50;
		Integer inputTal, antalMellomGrensene=0;

		// Lag textarea til � skriv ut innhald p�.
		JTextArea tabellen = new JTextArea();
		tabellen.setText("Antal tal mellom "+nedreGrense+" og "+ovreGrense+": \n");

		inputTal = heiltalInput("Hit me baby, one more tal");

		while(inputTal>0){
			if(inputTal>nedreGrense && inputTal<ovreGrense)
			antalMellomGrensene++;

			inputTal = heiltalInput("One more tal?");
		}

		String antalMellomGrenseneTxt = Integer.toString(antalMellomGrensene);
		tabellen.append( antalMellomGrenseneTxt + "\n");

		// Print it m�n.
		JOptionPane.showMessageDialog( null, tabellen);
	} // slutt p� main-metoden

	public static int heiltalInput(String s){
		Integer inputTalet=null;
		// Try-Catch-en gir feilmelding dersom nokon ikkje skriv inn tal, men stoppar ikkje main fr� � krasje. M� finne ut korleis ein skal "lande kontrollert".
		try{ inputTalet = Integer.parseInt(JOptionPane.showInputDialog(s));
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog( null, "Det var vel eit tal eg spurte om?" );
		}finally{  // Litt usikker p� kva denne finally-gjer.
			return inputTalet;
		}
	} // slutt p� heiltalInput-metoda

} // slutt p� klasse