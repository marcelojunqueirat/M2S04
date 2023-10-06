package ex3;

public class TestaProduto {
    public static void main(String[] args) {
        Produto produto = new Produto(150.0, 10);
        System.out.println(produto.calcularValorComImposto());
    }
}
