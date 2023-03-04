package edu.java.modificadores;

public class ClasePadre {
	
	// Atributos
	
	public int variable1;
	private int variable2;
	protected int variable3;
	
	// Getter y Setter
	
	public int getVariable2() {
		return variable2;
	}
	
	public void setVariable2(int variable2) {
		this.variable2 = variable2;
	}
	
	// Métodos de la clase
	public void mostrarVariable(){
		System.out.println("El valor de unaVariable es: " + this.variable1);
	}
}
