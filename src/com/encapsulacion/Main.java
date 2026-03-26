package com.encapsulacion;

public class Main {
	public static void main(String[] args) {
		//clasePersona();
		Rectangulo r1 = new Rectangulo(10,25);
		Rectangulo r2 = new Rectangulo (50, 5);
		
		r1.compararCon(r2);
		
	}
		
	public static void clasePersona() {
		Persona p1 = new Persona("Juan", "Sandoval", 20);
		Persona p2 = new Persona("Alejandro", "Hernandez", 32);
		Persona p3 = new Persona("Sara", "Connor", 40);
		
		p1.mostrar();
		p2.mostrar();
		p3.mostrar();
		
	}

}
