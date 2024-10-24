package ContaBancaria;

// Classe ContaPoupanca que herda de ContaBancaria
public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    // Implementação do método de saque para Conta Poupança
    public void saque(double valor) {
        double taxaSaque = valor * 0.005;  // 0,5% de taxa
        double totalSaque = valor + taxaSaque;

        if (totalSaque <= saldo) {
            saldo -= totalSaque;
            System.out.println("Saque de " + valor + " realizado com sucesso (taxa de " + taxaSaque + "). Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    // Implementação do método de depósito para Conta Poupança
    public void deposito(double valor) {
        double taxaDeposito = valor * 0.001;  // 0,1% de taxa
        saldo += (valor - taxaDeposito);
        System.out.println("Depósito de " + valor + " realizado com sucesso (taxa de " + taxaDeposito + "). Saldo atual: " + saldo);
    }

    // Implementação do método de consulta para Conta Poupança
    public void consulta() {
        System.out.println("Saldo atual da Conta Poupança: " + saldo);
    }
}
