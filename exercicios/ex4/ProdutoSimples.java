package exercicios.ex4;

import java.util.Scanner;

public class ProdutoSimples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int prod = scan.nextInt();

        System.out.println("Digite um número inteiro: ");
        int prod2 = scan.nextInt();

        int multiplicação = prod * prod2 ;
        System.out.println("PRODUTO = " + multiplicação);

        scan.close();
    }
}
