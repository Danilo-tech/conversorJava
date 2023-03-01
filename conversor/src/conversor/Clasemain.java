package conversor;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Clasemain {

	public static void main(String[] args) {
		
		boolean seguirprograma = true;
		while (seguirprograma) {
		
		String[] opciones = { "Conversion de moneda", "Conversion de temperatura"};

		String menu = (String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu",
				JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
		
			
			String montoaRecibir = JOptionPane.showInputDialog("Ingrese el monto a convertir");
			DecimalFormat formato = new DecimalFormat("#.##");
			double monto = 0;
			monto = Double.parseDouble(montoaRecibir);
		
		if (menu.equals("Conversion de moneda")) {			
			String[] divisas = { "Soles a Dolares", "Soles a Euros", "Soles a Libras Esterlinas", "Soles a Yen-Japones", "Soles a Won-SurCoreano", "Dolares a Soles", "Euros a Soles", "Libras Esterlinas a Soles","Yen-Japones a Soles", "Won-SurCoreano a Soles"};
			
			String ventanaConversor = (String) JOptionPane.showInputDialog(null, "Elija una opción", "Conversor de moneda", JOptionPane.QUESTION_MESSAGE, null, divisas, divisas[0]);

			//int montoint = (int)monto; 
			// Operaciones con divisas

			if (ventanaConversor.equals("Soles a Dolares")) {
				double dolares = monto / 3.81;
				JOptionPane.showMessageDialog(null,
						monto + " soles peruanos son : $" +formato.format(dolares) + " dólares.");
			} else if (ventanaConversor.equals("Soles a Euros")) {
				double euro = monto / 4.04;
				JOptionPane.showMessageDialog(null,
						monto + " soles peruanos son: €" + formato.format(euro)+ " euros.");
			} else if (ventanaConversor.equals("Soles a Libras Esterlinas")) {
				double libra = monto / 4.58;
				JOptionPane.showMessageDialog(null,
						monto + " soles peruanos son: £" + formato.format(libra)+ " libras.");
			} else if (ventanaConversor.equals("Soles a Yen-Japones")) {
				double yen = monto / 0.028;
				JOptionPane.showMessageDialog(null,
						monto + " soles peruanos son: ¥" + formato.format(yen)+ " yenes.");
			} else if (ventanaConversor.equals("Soles a Won-SurCoreano")) {
				double won = monto / 0.0029;
				JOptionPane.showMessageDialog(null,
						monto + " soles peruanos son: ₩" + formato.format(won) + " wones.");
			}else if (ventanaConversor.equals("Dolares a Soles")) {
				double dolares = monto * 3.81;
				JOptionPane.showMessageDialog(null,
						monto + " dólares son : S/" +formato.format(dolares) + " soles.");
			} else if (ventanaConversor.equals("Euros a Soles")) {
				double euro = monto * 4.04;
				JOptionPane.showMessageDialog(null,
						monto + " euros son: S/" + formato.format(euro)+ " soles.");
			} else if (ventanaConversor.equals("Libras Esterlinas a Soles")) {
				double libra = monto * 4.58;
				JOptionPane.showMessageDialog(null,
						monto + " libras son: S/" + formato.format(libra)+ " soles.");
			} else if (ventanaConversor.equals("Yen-Japones a Soles")) {
				double yen = monto * 0.028;
				JOptionPane.showMessageDialog(null,
						monto + " yenes son: S/" + formato.format(yen)+ " soles.");
			} else if (ventanaConversor.equals("Won-SurCoreano a Soles")) {
				double won = monto * 0.0029;
				JOptionPane.showMessageDialog(null,
						monto + " wones son: S/" + formato.format(won) + " soles.");
			
		}
			
		}
			else if (menu.equals("Conversion de temperatura")) {
			
			String[] Temperaturas = { "Celsius a Fahrenheit", "Fahrenheit a Celsius", "Celsius a Kelvin", "Kelvin a Celsius", "Fahrenheit a Kelvin", "Kelvin a Fahrenheit"  };
			
			String ventanaTemperaturas = (String) JOptionPane.showInputDialog(null, "Elija una opción", "Conversor de temperaturas", JOptionPane.QUESTION_MESSAGE, null, Temperaturas, Temperaturas[0]);
			
		
			
			// Operaciones con temperaturas

						if (ventanaTemperaturas.equals("Celsius a Fahrenheit")) {
							double CF = (monto * 9/5)+32;
							JOptionPane.showMessageDialog(null,
									monto + " grados Celsius son : " +formato.format(CF) + " grados Fahrenheit.");
							
						} else if (ventanaTemperaturas.equals("Fahrenheit a Celsius")) {
							double FC = (monto - 32) * 5 / 9;
							JOptionPane.showMessageDialog(null,
									monto + " grados Fahrenheit son: " + formato.format(FC)+ " grados Celsius.");
							
						} else if (ventanaTemperaturas.equals("Celsius a Kelvin")) {
							double CK = monto + 273.15;
							JOptionPane.showMessageDialog(null,
									monto + " grados Celsius son: " + formato.format(CK)+ " grados Kelvin.");
							
						} else if (ventanaTemperaturas.equals("Kelvin a Celsius")) {
							double KC = monto + 273.15;
							JOptionPane.showMessageDialog(null,
									monto + " grados Kelvin son: " + formato.format(KC)+ " grados Celsius.");
							
						} else if (ventanaTemperaturas.equals("Fahrenheit a Kelvin")) {
							double FK = (monto - 32) *5 / 9 +273.15;
							JOptionPane.showMessageDialog(null,
									monto + " grados Fahrenheit son: " + formato.format(FK)+ " grados Kelvin.");
							
						} else if (ventanaTemperaturas.equals("Kelvin a Fahrenheit")) {
							double KF = (monto - 273.15)*9 / 5 +32;
							JOptionPane.showMessageDialog(null,
									monto + " grados Kelvin son: " + formato.format(KF)+ " grados Fahrenheit.");
						}
			
		}
		int continuar = JOptionPane.showConfirmDialog(null, "desea seguir usando el programa?", "",
				JOptionPane.YES_NO_OPTION);

		if (continuar == JOptionPane.NO_OPTION) {
			seguirprograma = false;
			JOptionPane.showMessageDialog(null, "Programa finalizado");}

		}
		
	}

}

