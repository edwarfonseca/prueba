package herencia;

import javax.swing.JOptionPane;

public class Estudiante extends Persona {
	private int codigoEstudiante;
	private float notaFinal;
	
	public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal) {
		super(nombre, apellido, edad);
		this.codigoEstudiante = codigoEstudiante;
		this.notaFinal = notaFinal;
	}
	
	public void mostrarDatos() {
		JOptionPane.showMessageDialog(null, "\tHistorial Estudiante"
				+ "\nNombre: "+getNombre()
				+ "\nApellido: "+getApellido()
				+ "\nEdad: "+getEdad()
				+ "\n"
				+ "\nCodigo: "+codigoEstudiante
				+ "\nNota final: "+notaFinal);
	}
}
