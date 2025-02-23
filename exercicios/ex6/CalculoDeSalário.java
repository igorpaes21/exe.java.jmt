package exercicios.ex6;

import java.util.Scanner;

public class CalculoDeSalário {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double htrab, valor;
        int qhtrab;

        System.out.println("Digite o valor da hora trabalhada: R$  ");
        htrab = scan.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        qhtrab = scan.nextInt();

        valor = htrab * qhtrab;
        System.out.println("O trabalhador receberá: R$ " + valor);
    }
}
