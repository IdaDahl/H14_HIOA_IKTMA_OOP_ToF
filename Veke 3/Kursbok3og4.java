import javax.swing.JOptionPane;

// Eg drifta litt vekk fr� leksjonen her eit lite �yeblikk, s� denne er nok litt ut over sp�rsm�let.
public class Kursbok3og4
{
	String tittel="";

	public Kursbok3og4( String arg){
		tittel = arg;
	}
	public void visTittel(){
		String mld = "Kursi heiter: "+tittel;
		JOptionPane.showMessageDialog(null,mld);
	}

	public void setTittel( String nyTittel){
		tittel = nyTittel;
	}

	public String getTittel(){
		return tittel;
	}
}