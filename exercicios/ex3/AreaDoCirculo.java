package exercicios.ex3;

import java.util.Scanner;

public class AreaDoCirculo {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        double raio, area;

        System.out.println("Escreva o valor do raio: ");
        raio = scan.nextDouble();

        area = 3.14 * (Math.pow(raio, 2));

        System.out.println("O valor da area é: " + area);


    }
}
