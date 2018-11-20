// TODO Inserire il package corretto
// nota: potete usare il suggerimento della lampadina a sinistra (scegliete l'unica opzione sensata). 
package Compito;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Formula 1 passion");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// TODO Inserire la size in accordo con il wireframe (valori approssimati)
		super.setSize(640,480);
		
		// TODO Usare StringBuilder per costruire la stringa HTML
		StringBuilder sb= new StringBuilder();
		// TODO Creare la stringa HTML per il wireframe
		sb.append("<html>");
		sb.append("<head><h1><b>Live the Company</h1></head>");
		sb.append("<body>");
		sb.append("<table>");
		sb.append("<tr><th><h2><b>Evento</b></h2></th>");
		sb.append("<th><h2><b>Data</b></h2></th>");
		sb.append("<th><h2><b>Vado?</b></h2></th></tr>");
		sb.append("<tr><th>Cocktail party</th>");
		sb.append("<th>7 dic</th>");
		sb.append("<th>Si</th></tr>");
		sb.append("<tr><th>Colazione sociale</th>");
		sb.append("<th>12 dic</th>");
		sb.append("<th>Si</th></tr>");
		sb.append("<tr><th>Saluti di Natale</th>");
		sb.append("<th>12 dic</th>");
		sb.append("<th>No</th>");
		sb.append("</table>");
		sb.append("</body>");
		sb.append("</html>");
		
		// TODO Convertire lo StringBuilder in String
		String html= sb.toString();
		// TODO Assegnare correttamente la stringa create a JLabel
		super.add(new JLabel(html));
		super.setVisible(true);
		 
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}
