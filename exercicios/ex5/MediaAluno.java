package exercicios.ex5;

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double nota_1, nota_2, nota_3, nota_4, media;
        System.out.println("Digite a 1° nota do aluno:  ");
        nota_1 = scan.nextDouble();

        System.out.println("Digite a 2° nota do aluno:  ");
        nota_2 = scan.nextDouble();

        System.out.println("Digite a 3° nota do aluno:  ");
        nota_3 = scan.nextDouble();

        System.out.println("Digite a 4° nota do aluno:  ");
        nota_4 = scan.nextDouble();

        media = (nota_1 + nota_2 + nota_3 + nota_4) / 4;

        System.out.println("A média do aluno é: " + media);

        if (media < 5.0) {
            System.out.println("REPROVADO");
        } else if (media <= 6) {
            System.out.println("RECUPERAÇÃO");
        } else {
            System.out.println("APROVADO");
        }

        scan.close();
    }
}
