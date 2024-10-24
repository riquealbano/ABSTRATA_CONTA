package ContaBancaria;

// Classe ContaCorrente que herda de ContaBancaria
public class ContaCorrente extends ContaBancaria {
    private double limite;  // Limite adicional após o saldo esgotar

    // Construtor da Conta Corrente, incluindo o limite
    public ContaCorrente(double saldoInicial, double limite) {
        super(saldoInicial);
        this.limite = limite;
    }

    // Implementação do método de saque para Conta Corrente
    public void saque(double valor) {
        double taxaSaque = valor * 0.01;  // 1% de taxa
        double totalSaque = valor + taxaSaque;

        if (totalSaque <= saldo + limite) {
            saldo -= totalSaque;
            if (saldo < 0) {
                limite += saldo;  // Reduz o limite caso saldo seja negativo
                saldo = 0;
            }
            System.out.println("Saque de " + valor + " realizado com sucesso (taxa de " + taxaSaque + "). Saldo atual: " + saldo + ", Limite restante: " + limite);
        } else {
            System.out.println("Limite insuficiente para realizar o saque.");
        }
    }

    // Implementação do método de depósito para Conta Corrente
    public void deposito(double valor) {
        double taxaDeposito = valor * 0.002;  // 0,2% de taxa
        saldo += (valor - taxaDeposito);
        System.out.println("Depósito de " + valor + " realizado com sucesso (taxa de " + taxaDeposito + "). Saldo atual: " + saldo);
    }

    // Implementação do método de consulta para Conta Corrente
    public void consulta() {
        System.out.println("Saldo atual da Conta Corrente: " + saldo + ". Limite disponível: " + limite);
    }
}
