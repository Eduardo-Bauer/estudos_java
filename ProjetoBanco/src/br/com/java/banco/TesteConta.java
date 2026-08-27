package br.com.java.banco;

public class TesteConta {
	public static void main(String[] args) {
		Conta contaCorrente = new Conta();
		Conta contaPoupanca = new Conta(234, 1, 1000);
		
		// adicionando valores para teste
		contaCorrente.setAgencia(230);
		contaCorrente.setNumero(321);
		
		// teste de deposito
		contaCorrente.depositar(100);
		System.out.println(contaCorrente.getSaldo());
		
		// teste de retirada
		contaCorrente.retirar(100);
		System.out.println(contaCorrente.getSaldo());
		
		// teste de deposito
		contaPoupanca.depositar(500);
		System.out.println(contaPoupanca.getSaldo());
		
		// teste de retirada
		contaPoupanca.retirar(500);
		System.out.println(contaPoupanca.getSaldo());
	}
}
