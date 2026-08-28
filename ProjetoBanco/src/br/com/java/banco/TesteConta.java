package br.com.java.banco;

public class TesteConta {
	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente();
		Conta cc = new ContaCorrente();
		
		contaCorrente.setChequeEspecial(100);
		System.out.println(contaCorrente.getSaldoDisponivel());
		
		//cast de classes
		if (cc instanceof ContaCorrente) {
			ContaCorrente conta1 = (ContaCorrente) cc;
		}
	}
}
