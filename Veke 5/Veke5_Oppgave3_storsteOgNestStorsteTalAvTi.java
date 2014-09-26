/* OPPGAVETEKST:
Lag et program som beregner og skriver ut (i en dialogboks) summen
  2 + 4 + 6 + 8 + ... + 98    */

import javax.swing.JOptionPane;


public class Veke5_Oppgave3_storsteOgNestStorsteTalAvTi
{
    public static void main( String args[] )
    {
		// Definer variablane for metoda.
		Integer inputTalet=0,storsteTal=0 ,nestStorsteTal=0;
		String inputTaletTXT="",melding="";
		Integer i=1;  // M� definere denne variabelen her, fordi den blir brukt ogs� utanfor FOR-loopen (linje 34 +- ;) )
		Integer ikkjeKansellert=0;

		for ( i = 1; i <= 10; i += 1 ){
			inputTaletTXT = JOptionPane.showInputDialog("Gi meg et tal");
			if(inputTaletTXT!=null){ // Sjekk, i tilfelle brukaren trykte cancel.
				try{ inputTalet = Integer.parseInt(inputTaletTXT);
			}catch(NumberFormatException e){
				JOptionPane.showMessageDialog( null, "Det var vel eit tal eg spurte om?" );
			 }
			}else break; // Bryt ut av loopen, viss cancel.
			if(inputTalet>storsteTal || i==1){  // Dersom talet er st�rre enn tidligare st�rste tal, eller dette er f�rste tal.
				if(i>1) nestStorsteTal = storsteTal; // F�rste runda i loopen, kan vi ikkje definere nest st�rste tal...
				storsteTal=inputTalet;
			}else if(inputTalet>nestStorsteTal){ //Talet kan vere st�rre enn nest-st�rste tal...
				nestStorsteTal = inputTalet;
			}
			ikkjeKansellert++; // Held styr p� runder i loopen, f�r den ev. blir kansellert.
		}
		// En sjekk p� om det er tasta inn tal st�rre enn null ( negative tal bryr vi oss ikkje om idag).
		if(ikkjeKansellert>0) melding = "St�rste tal du oppgav, var: "+storsteTal;
		if(ikkjeKansellert>1) melding += ", og det nest st�rste var: "+nestStorsteTal;
		if(storsteTal!=0) JOptionPane.showMessageDialog( null, melding +ikkjeKansellert );
		else JOptionPane.showMessageDialog( null, "Takk for ingenting, latstokk" );
    } // slutt p� main-metoden
 } // slutt p� klasse