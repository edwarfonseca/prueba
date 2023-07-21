package herencia;

import javax.swing.JOptionPane;

public class Profesor extends Persona{
	private String correo;
	private String rango;
	
	public Profesor(String nombre, String apellido, int edad, String correo, String rango){
		super(nombre, apellido, edad);
		this.correo = correo;
		this.rango = rango;
	}
	
	public boolean comprobarCorreo() {
		String comprobacion = "@gmail.com";
		boolean band = false;
		band = correo.contains(comprobacion);
		
		if (band == true) {
			JOptionPane.showMessageDialog(null, "Login-sucessfully");
		} else {
			JOptionPane.showMessageDialog(null, "Login-error");
		}
		return band;
	}
}
