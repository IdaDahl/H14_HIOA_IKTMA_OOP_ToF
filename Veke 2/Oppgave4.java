import javax.swing.JOptionPane;

public class Oppgave4
 {
   public static void main(String[] args)
   {
	 String forsteSiffer = JOptionPane.showInputDialog("Oppgi f�rste desimaltall.");
	 String andreSiffer = JOptionPane.showInputDialog("Oppgi andre desimaltall.");

	 double f�rsteTal = Double.parseDouble(forsteSiffer);
	 double andreTal = Double.parseDouble(andreSiffer);

	 String utskrift = forsteSiffer +" + " + andreSiffer + " = "+ (f�rsteTal+andreTal);
     JOptionPane.showMessageDialog(null, utskrift);
  }
}