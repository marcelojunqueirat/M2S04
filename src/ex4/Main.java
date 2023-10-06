package ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isIdadeValida = false;

        do {
            System.out.println("Informe sua idade: ");
            int idade = scanner.nextInt();
            try {
                validarIdade(idade);
                System.out.println("Olá, você tem " + idade +" anos de idade!");
                isIdadeValida = true;
            } catch (IdadeInvalidaException e){
                System.out.println(e.getMessage());
            }
        } while (!isIdadeValida);
    }

    private static void validarIdade(int idade) {
        if (idade <= 0 || idade > 100)
            throw new IdadeInvalidaException("Você informou uma idade inválida! Tente novamente.");
    }
}
