package com.encapsulacion;

public class Fecha {
	
	private int dia;
	private int mes;
	private int año;
	
	public Fecha(int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	@Override
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", año=" + año + "]";
	}
	
	public void esValida() {
		if (this.dia > 31 || this.dia < 1) {
			System.out.println("La fecha es invalida");
			return;
		} else if (this.mes < 1 || this.mes > 12) {
			System.out.println("La fecha es invalida");
			return;
		}else {
			System.out.println("La fecha es Valida");
		}
	}

}
