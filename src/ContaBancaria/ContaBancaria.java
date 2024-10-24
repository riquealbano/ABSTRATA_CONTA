package ContaBancaria;

// Classe abstrata ContaBancaria
public abstract class ContaBancaria {
    protected double saldo;

    // Construtor para inicializar o saldo
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Métodos abstratos que serão implementados pelas subclasses
    public abstract void saque();
    public abstract void deposito();
    public abstract void consulta();
}