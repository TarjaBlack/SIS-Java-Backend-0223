import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Estruturas condicionais
        short idade = 19;

        // IF Simples
//        if (idade >= 18) { // Executa quando o resultado do teste for TRUE.
//            System.out.println("candidato apto ao exame de CNH.");
//        }

        // IF Composto
        double salario = 980.52;

        // Ou ele executa o IF, caso seja TRUE, ou executa o ELSE
        if (salario >= 0.0 && salario <= 1950.25) { // FALSE
            System.out.println("Contribuinte isento de IR.");
        } else { // Então
            System.out.println("Contribuinte deve pagar o IR.");
        }

        double sal, deducaoPorDep = 189.59;
        int dependentes;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o salário: ");
        sal = sc.nextDouble();
        System.out.println("Quantos dependentes: ");
        dependentes = sc.nextInt();

        // Pegar a tabela do IR 2022/23 e montar uma estrutura com If/ELSE
        // Se o contribuinte tiver 2 dependentes, se diminui 2x deducaoPorDep


    }

}
