package ex1;

public class ContaCorrente extends Conta implements Operavel {
    @Override
    protected double ObterSaldoAtual() {
        return super.saldo;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public double sacar(double valor) {
        this.saldo -= valor;
        return this.saldo;
    }
}
