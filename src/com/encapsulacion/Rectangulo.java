package com.encapsulacion;

public class Rectangulo {
	private int base;
	private int altura;
	
	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + "]";
	}

	public int area() {
		return base*altura;
	}
	public int perimetro() {
		
		return 2 *(base+altura);
	}
	
	public void compararCon(Rectangulo otro) {
		int areaRec1 = this.area();
		int areaRec2 = otro.area();
		
		if (areaRec1 > areaRec2) {
			System.out.println("El área mayor es de rectangulo 1 =  " + areaRec1);
		}else if (areaRec1 == areaRec2) {
			System.out.println("Ambas áreas son iguales ");
		}else {
			System.out.println("El área mayor es de rectangulo 2 =  " + areaRec2);
		}
	}
		
}
