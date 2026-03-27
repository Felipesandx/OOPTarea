package com.encapsulacion;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n - MENU - ");
            System.out.println("1. Clase Persona");
            System.out.println("2. Clase Rectangulo");
            System.out.println("3. Clase Producto");
            System.out.println("4. Clase Cuenta");
            System.out.println("5. Clase Libro");
            System.out.println("6. Clase Calculadora");
            System.out.println("7. Clase Fecha");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();

            switch (opcion) {
            case 0:
            	System.out.println("Saliendo del programa...");
                break;
            case 1: 
            	 clasePersona();
            	 break;
            case 2: 
            	claseRectangulo();
            	break;
            case 3: 
            	claseProducto();
            	break;
            case 4:
            	claseCuenta();
            	break;
            case 5:
            	claseLibro();
            	break;
            case 6:
            	claseCalculadora();
            	break;
            case 7:
            	claseFecha();
            	break;
            	default: 
            		System.out.println("Opcion invalida");
            }
            
        }while (opcion !=0);
        
        scanner.close();
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
	public static void claseFecha() {
		Fecha fecha1 = new Fecha(31,1,2006);
		Fecha fecha2 = new Fecha(19,13,1999);
		Fecha fecha3 = new Fecha(-1,12,2017);
		
		fecha1.esValida();
		fecha2.esValida();
		fecha3.esValida();
	}

}
