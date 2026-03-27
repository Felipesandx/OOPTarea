package com.encapsulacion;

public class Producto {
	private int codigo;
	private String nombre;
	private double precio;
	
	public Producto(int codigo, String nombre, double precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	public double aplicarDescuento(double porcentaje) {
		 return  this.precio= this.precio - (this.precio* porcentaje);
		
		
	}

	
}
