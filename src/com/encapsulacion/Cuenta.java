package com.encapsulacion;

public class Cuenta {
	
	private String titular;
	private double saldo;
	
	public Cuenta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", saldo=" + saldo + "]";
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double monto) {
		if ( monto  < 0 ) {
			System.out.println("El deposito no puede ser negativo");
		}else {
			this.saldo += monto;
		}
	}
	
	public void retirar(double monto) {
		if ( monto  < 0 ) {
			System.out.println("El monto no puede ser negativo");
		}else if (monto > this.saldo){
			System.out.println("Saldo insuficiente. Saldo actual: " + this.saldo);
		}else{
			this.saldo -= monto;
		}
	}

}
