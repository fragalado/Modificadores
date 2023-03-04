package edu.java.modificadores;

public class Principal {

	public static void main(String[] args) {
		// 
		ClaseHija res = new ClaseHija();
		
		// ClaseHija necesita asignar el valor 10 a variable1 desde su constructor. ¿Cómo se haría y por qué?
		res.variable1 = 10; // Como la clase hija extienda de la clase padre puede usar sus atributos y métodos, y como el atributo variable1
								// está con el modificador public, podremos asignarle un valor de este modo
		
		System.out.println("Valor de la variable1: "+ res.variable1);
		
		
		// Ahora, ClaseHija necesita asignar el valor -3 a variable2 desde el constructor de ClaseHija. ¿Cómo se haría y por qué?
		res.setVariable2(-3); // Lo mismo, pero el atributo variable2 tiene el modificador private por lo tanto no podremos acceder directamente a ella
									// , por ello accedemos a ella usando el getter y setter de la variable2
		
		System.out.println("Valor de la variable2: "+ res.getVariable2());
		
		
		// ClaseHija debe asignarle el valor 8 a variable3 desde su constructor.
		res.variable3 = 8; // Podemos acceder de esta manera porque lleva el modificador protected
								// esto significa que solo pueden acceder los de su mismo paquete o las clases que extiendan de ella.
		
		System.out.println("Valor de la variable3: "+ res.variable3);
	}

}
