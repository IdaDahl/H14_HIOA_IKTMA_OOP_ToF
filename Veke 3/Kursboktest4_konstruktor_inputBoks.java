import javax.swing.JOptionPane;

public class Kursboktest4_konstruktor_inputBoks
{
	public static void main( String[] args ){

		String tittel1 = JOptionPane.showInputDialog("Kva heiter fyrste kursi?");
		Kursbok4 bok1 = new Kursbok4(tittel1);  // Lag objektet, med tittel fra input
		JOptionPane.showMessageDialog(null,"Tittelen p� fyrste kurs er "+bok1.getTittel());

		// Sp�r etter om brukar vil lage fleire kurs.
		int svar = JOptionPane.showOptionDialog(null,"Lage ei bok til? (Velg yes)","Ikkje lage fleire? (Velg no)",
											JOptionPane.YES_NO_OPTION,
											JOptionPane.QUESTION_MESSAGE,null,null,null);
		if(svar==JOptionPane.YES_OPTION){
			String nyTittel2 = JOptionPane.showInputDialog("Kva heiter DEN d�?!?!");
			Kursbok4 bok2 = new Kursbok4(nyTittel2);
			JOptionPane.showMessageDialog(null,"Tittel p� objekt 2 er "+bok2.getTittel());
		}
	}
}