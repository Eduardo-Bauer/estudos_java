package br.com.java.banco;

import java.io.Serializable;

/**
 *Conta's class
 * @author Eduardo Bauer
 * @version 1.0
 */
public class Conta implements Serializable{
	private static final long serialVersionUID = 1L;
	private int agencia;
	private int numero;
	private double saldo;
	
	/**
	 *Conta's Method deposit
	 * @param valor -> money to increment
	 * @see retirar
	 */
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	/**
	 *Conta's Method withdraw 
	 * @param valor -> money to withdrawal
	 * @see depositar
	 */
	public void retirar(double valor) {
		this.saldo -= valor;
	}
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public Conta(int agencia, int numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public Conta() {
		
	}
}
