package exercicios.ex2;

import java.util.Scanner;

public class SomaDeValores {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite um número inteiro: ");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;
        System.out.println("Resultado da soma: " + soma);

        scanner.close();
    }


}
