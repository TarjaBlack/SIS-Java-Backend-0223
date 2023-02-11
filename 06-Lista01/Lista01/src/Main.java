import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        1.1.1 Construa um algoritmo que receba 1 (um) número inteiro e informe se ele é par
        ou ímpar no console.
         */

//        int num;
//
//        System.out.print("Digite um número inteiro: ");
//        num = sc.nextInt(); // 13
//
//        if (num % 2 == 0) {
//            System.out.println("O número " + num + " é par!");
//        } else {
//            System.out.println("O número " + num + " NÃO é par!");
//        }

        /*
        1.1.2 Construa um algoritmo que receba 3 (três) números inteiros e informe qual é o
        maior número. 4 2 9
         */

//        int n1, n2, n3;
//
//        for (int i = 1; i <= 3; i++) {
//
//            System.out.println("Digite três números diferentes: ");
//            System.out.print("Digite o número 01: ");
//            n1 = sc.nextInt();
//            System.out.print("Digite o número 02: ");
//            n2 = sc.nextInt();
//            System.out.print("Digite o número 03: ");
//            n3 = sc.nextInt();
//
//            if (n1 > n2 && n1 > n3) {
//                System.out.println("O número " + n1 + " é o maior.");
//            } else if (n2 > n1 && n2 > n3) {
//                System.out.println("O número " + n2 + " é o maior.");
//            } else {
//                System.out.println("O número " + n3 + " é o maior.");
//            }
//
//        } // Fecha o For

        /*
        1.1.3 Construa um algoritmo que receba 6 (seis) notas, do tipo double, entre o
        intervalo de 0.0 – 10.0 e logo após calcule a média aritmética. Ao final o
        programa deve imprimir na tela o status do aluno com base nas seguintes
        regras de avaliação:
         0.0 – 2.99 Aluno reprovado por nota;
         3.0 – 5.99 Aluno em recuperação;
         6.0 – 10.0 Aluno aprovado por nota.
         */

//        double n1, n2, n3, n4, n5, n6, media;
//
//        System.out.print("Digite a N1: ");
//        n1 = sc.nextDouble();
//        System.out.print("Digite a N2: ");
//        n2 = sc.nextDouble();
//        System.out.print("Digite a N3: ");
//        n3 = sc.nextDouble();
//        System.out.print("Digite a N4: ");
//        n4 = sc.nextDouble();
//        System.out.print("Digite a N5: ");
//        n5 = sc.nextDouble();
//        System.out.print("Digite a N6: ");
//        n6 = sc.nextDouble();
//
//        media = (n1 + n2 + n3 + n4 + n5 + n6) / 6;
//
//        if (media < 3.0) {
//            System.out.printf("Média do aluno: %.2f - REPROVADO", media);
//        } else if (media <= 5.99) {
//            System.out.printf("Média do aluno: %.2f - EM RECUPERAÇÃO", media);
//        } else {
//            System.out.printf("Média do aluno: %.2f - APROVADO", media);
//        }

        /*
        1.2.1 Construa um algoritmo que receba um número inteiro no intervalo de 1 – 7 e
        imprima na tela o respectivo dia da semana na seguindo a tabela abaixo:
         1 – domingo
         2 – segunda-feira
         3 – terça-feira
         4 – quarta-feira
         5 – quinta-feira
         6 – sexta-feira
         7 – sábado
        Caso seja digitado um valor fora do intervalo informar a mensagem: “Número
        inválido”.
         */

//        int num;
//
//        System.out.print("Digite um número refernte ao dia da semana: ");
//        num = sc.nextInt();
//
//        switch (num) {
//            case 1:
//                System.out.println("Hoje é domingo.");
//                break;
//            case 2:
//                System.out.println("Hoje é segunda-feira.");
//                break;
//            case 3:
//                System.out.println("Hoje é terça-feira.");
//                break;
//            case 4:
//                System.out.println("Hoje é quarta-feira.");
//                break;
//            case 5:
//                System.out.println("Hoje é quinta-feira.");
//                break;
//            case 6:
//                System.out.println("Hoje é sexta-feira.");
//                break;
//            case 7:
//                System.out.println("Hoje é domingo.");
//                break;
//            default:
//                System.out.println("Número inválido!");
//        }

        /*
        1.3.1 Construa um algoritmo que conte de zero até 50 e imprima somente os números
        ímpares.
         */

//        int numero = 0; // É preciso inicializar
//
//        while (numero < 52) {
//            if (numero % 2 != 0) {
//                System.out.println(numero);
//            }
//            numero++;
//        }

        /*
        1.4.1 Construa um algoritmo que leia os salários de 15 funcionários e ao fim mostre a média salarial dos mesmos.
         */
        double salario, acumulador = 0.0, mediaSalarial;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Digite o salário: ");
            salario = sc.nextDouble();
            acumulador = acumulador + salario;
        }

        mediaSalarial = acumulador / 3;

        System.out.printf("A média dos salários dos funcionários é de: %.2f", mediaSalarial);
    }
}
