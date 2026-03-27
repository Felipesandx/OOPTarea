package com.encapsulacion;

public class Main {
	public static void main(String[] args) {
		//clasePersona();
		//claseRectangulo();
		//claseProducto();
		//claseCuenta();
		//claseLibro();
		claseCalculadora();
		
		
		
	}
		
	public static void clasePersona() {
		Persona p1 = new Persona("Juan", "Sandoval", 20);
		Persona p2 = new Persona("Alejandro", "Hernandez", 32);
		Persona p3 = new Persona("Sara", "Connor", 40);
		
		p1.mostrar();
		p2.mostrar();
		p3.mostrar();
		
	}
	public static void claseRectangulo() {
		Rectangulo r1 = new Rectangulo(14,25);
		Rectangulo r2 = new Rectangulo (50, 5);
		
		r1.compararCon(r2);
	}
	public static void  claseProducto() {
		Producto prod1 = new Producto(1, "Laptop", 1000.0);
		   
	    System.out.println("Antes del descuento: " + prod1);
	    double precioFinal = prod1.aplicarDescuento(0.10);
	    
	    System.out.println("Después del descuento: " + prod1);
	    System.out.println("Precio final: " + precioFinal);
		
	}
	public static void claseCuenta() {
		
		Cuenta cuenta1 = new Cuenta ("Fernando Medina", 1000);
		
		System.out.println("Saldo antes de la transferencia " + cuenta1.getSaldo());
		cuenta1.depositar(500);
		System.out.println("Saldo despues de la transferencia " + cuenta1.getSaldo());
		cuenta1.retirar(8000);
		System.out.println("Saldo despues del retiro " + cuenta1.getSaldo());
	}
	public static void claseLibro() {
		
		Libro[] libros = {
				new Libro("El Señor de los Anillos", "Tolkien", 500),
			    new Libro("El Principito", "Saint-Exupéry", 96),
			    new Libro("1984", "George Orwell", 328),
		};
		
		for (Libro libro: libros) {
			System.out.println(libro.getTitulo() + ": " + 
                    (libro.esLargo() ? "Largo" : "Corto"));
		}
	}
	public static void claseCalculadora() {
		
		Calculadora calc1 = new Calculadora(4,5);
		System.out.println("La suma es: " + calc1.sumar());
		System.out.println("La resta es: " + calc1.restar());
		System.out.println("La multiplicación es: " + calc1.multiplicar());
		calc1.setNumero2(0);
		System.out.println(calc1.dividir());
		calc1.setNumero2(2);
		System.out.println("La division es: " + calc1.dividir());
	}

}
