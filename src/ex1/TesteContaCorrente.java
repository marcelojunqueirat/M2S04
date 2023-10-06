package ex1;

public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(100.0);
        System.out.println("Depósito: " + contaCorrente.ObterSaldoAtual());

        contaCorrente.sacar(55.0);
        System.out.println("Saldo Atual: " + contaCorrente.ObterSaldoAtual());
    }
}
