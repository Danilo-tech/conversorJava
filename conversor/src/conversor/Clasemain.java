package conversor;

import javax.swing.JOptionPane;

public class Clasemain {


	
	public static void main(String[] args) {
		 String[] opciones = {
		            "Conversion de moneda",
		            "Conversion de temperatura"
		          
		        };
		        
		        String menu = (String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu", JOptionPane.DEFAULT_OPTION,null,opciones, opciones[0]);
		

	}

}
