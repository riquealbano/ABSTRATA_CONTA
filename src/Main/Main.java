package Main;

// Importação dos pacotes que irei usar
import ContaBancaria.ContaCorrente;
import ContaBancaria.ContaPoupanca;
import ContaBancaria.ContaBancaria;

public class Main {

	public static void main(String[] args) {
		
		// Cria uma Conta Corrente com saldo inicial de 1000 e limite de 500
        ContaBancaria contaCorrente = new ContaCorrente(1000, 500);
        contaCorrente.deposito(200);   // Depósito de 200
        contaCorrente.saque(1100);     // Saque acima do saldo, mas dentro do limite
        contaCorrente.consulta();      // Consulta o saldo e o limite

        System.out.println("---------------");

        // Cria uma Conta Poupança com saldo inicial de 2000
        ContaBancaria contaPoupanca = new ContaPoupanca(2000);
        contaPoupanca.deposito(300);   // Depósito de 300
        contaPoupanca.saque(2500);     // Tentativa de saque maior que o saldo
        contaPoupanca.saque(100);      // Saque válido
        contaPoupanca.consulta();      // Consulta o saldo
	}

}
