import javax.swing.JOptionPane;

// Eg drifta litt vekk fr� leksjonen her eit lite �yeblikk, s� denne er nok litt ut over sp�rsm�let.
public class Kursbok2
{
	String txt="";

	public Kursbok2( String arg){

		this.txt = arg;
	}
	public void visTittel(){

		String mld = "Kursi heiter: "+this.txt;
		JOptionPane.showMessageDialog(null,mld);

	}

}