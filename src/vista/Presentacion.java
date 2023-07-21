package vista;

import javax.swing.JOptionPane;

public class Presentacion {
	public String inputString(String message) {
		return JOptionPane.showInputDialog("Ingrese "+message);
	}
	
	public int inputInt(String message) {
		return Integer.parseInt(JOptionPane.showInputDialog("Ingrese "+message));
	}
	
	public float inputFloat(String message) {
		return Float.parseFloat(JOptionPane.showInputDialog("Ingrese "+message));
	}
}
