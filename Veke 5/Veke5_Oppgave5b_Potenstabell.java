/* OPPGAVETEKST:
	http://www.iu.hio.no/~kjetilg/uvstoff/intro/kap5.html#oppg5
*/

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Veke5_Oppgave5b_Potenstabell
{
	private	JTextArea tabellen;
	private Integer startverdi;
	private Integer makseksponent;
	private Integer antall;

	public void Veke5_Oppgave5b_Potenstabell(){

		/* Pr�var flytte validering og datamanipulering inn i set/get-metodane. Fyljande linje er gamal:
		this.startverdi= Integer.parseInt(JOptionPane.showInputDialog("Oppgi starttal")); */
		this.setStartverdi(  Integer.parseInt(JOptionPane.showInputDialog("Oppgi starttal")) ); // Pr�vde flytte innhenting(input-dialogen) ogs� til set-metoda, gav opp i denne omgang.
		// Dei neste to egenskapane er enno ikkje implementert som setMetodar, slik setStartverdi er.
		this.makseksponent= Integer.parseInt(JOptionPane.showInputDialog("Oppgi antal potensar"));
		this.antall= Integer.parseInt(JOptionPane.showInputDialog("Oppgi antal tal du vil rekne potensar for"));

		// lag tekstomr�det for potenstabellen, f�rst som lokalt objekt for denne metoda, alts� som ein "vanlig" variabel (utan "this." )
		JTextArea tabellen = new JTextArea();

		// Ein loop f�rst for � lage OVERSKRIFTER, fra 1. til makseksponent'e.
		for( int o=1; o<=this.makseksponent; o++) 	tabellen.append(o+".potens\t");
		tabellen.append( "\n" ); // Linjeskift etter overskrifta.

		// Debug:
			JOptionPane.showMessageDialog( null,"Vi har lagra i Startverdi: "+this.startverdi + " " + this.makseksponent + " " + this.antall );

		// S� loop som set inn tala, f�rst ein ytre loop som g�r gjennom radene (alts� this.antall)
		for( int i=this.startverdi; i<(this.startverdi+this.antall); i++){
			// S� denne for-loopen som g�r gjennom kolonnene.
			for ( int j=1; j<=this.makseksponent; j++){
				tabellen.append( Integer.toString( power(i,j) )+"\t");
			}
			tabellen.append( "\n" );
		}
		// Til slutt, putt tabellen inn i instans-variabelen this.tabellen, s� f.eks. getTabellen-metoda kan returnere den seinare.
		this.tabellen = tabellen;
	}

	public JTextArea getTabellen(){
		return this.tabellen;
	}

/* Andre GET'ers og SET'ers */
 //  GET
	private int getStartverdi(int n){		return this.startverdi;			}

	private int getMakseksponent(int n){	return this.makseksponent;  	}

	private int getAntall(int n){ 			return this.antall; 			}

 //  SET
	private void setStartverdi(int n){
		// Fyljande er meint � skulle fange opp ev. feil input (tekst f.eks.), den gjer ikkje det. Skiten krasjar i staden... :)
		try{ this.startverdi = n;
		}catch(NumberFormatException e){
			// Slett, truleg: n = Integer.parseInt(JOptionPane.showInputDialog("Oppgi starttal"));
			JOptionPane.showMessageDialog( null, "Det var vel eit tal eg spurte om?" );
		 }
	}

	private void setMakseksponent(int n){	this.makseksponent = n;			}

	private void setAntall(int n){			this.antall = n;				}

/* Berekningsmetodar - ymse sm�pjask...  */

	public static int power(int x, int y){
		// Beregner og returnerer potensen med grunntall x og eksponenent y
		return (int)Math.pow( x,y );
	}

}