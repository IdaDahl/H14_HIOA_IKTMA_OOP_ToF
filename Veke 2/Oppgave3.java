import javax.swing.JOptionPane;

public class Oppgave3
 {
   public static void main(String[] args)
   {
	 String forsteSiffer = JOptionPane.showInputDialog("F�rste tall?");
	 String andreSiffer = JOptionPane.showInputDialog("Andre tall?");

	 int f�rsteTal = Integer.parseInt(forsteSiffer);
	 int andreTal = Integer.parseInt(andreSiffer);

	 String utskrift = forsteSiffer +" + " + andreSiffer + " = "+ (f�rsteTal+andreTal);
     JOptionPane.showMessageDialog(null, utskrift);
  }
}